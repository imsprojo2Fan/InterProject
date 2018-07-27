package com.inter;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2//开启自动生成api文档
@MapperScan("com.inter.dao")//扫描mybatis mapper包
@EnableAsync//开启异步请求
@EnableScheduling//定时器
public class InterestingApplication {



	/*配置http兼容https--------------------------------------------------------------------开始*/

	@Value("${http.port}")
	private Integer port;
	@Bean
	public ServletWebServerFactory servletContainer() {

		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
		tomcat.addAdditionalTomcatConnectors(createStandardConnector()); // 添加http
		return tomcat;
	}
	// 配置http
	private Connector createStandardConnector() {
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setPort(port);
		return connector;
	}

	/*配置http兼容https--------------------------------------------------------------------结束*/

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(InterestingApplication.class);
		//修改Banner的模式为OFF
		builder.bannerMode(Banner.Mode.OFF).run(args);
	}



}

