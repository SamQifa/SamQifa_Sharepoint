package mountain.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.apache.log4j.Logger;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.util.Log4jConfigListener;


public class Initializer implements WebApplicationInitializer {
//	private static Properties sysParams = new Properties();
//	public static Properties getSysParams() {
//		return sysParams;
//	}
	private static Logger log = Logger.getLogger(Initializer.class);
	public void onStartup(ServletContext servletContext)
			throws ServletException {
//		try {
//			String sysParamsLocation=this.getClass().getResource("/").getFile().replace("/classes/", "/sysParams.properties");
//			sysParams.load(new FileReader(sysParamsLocation));
//		} catch (IOException e) {
//		}
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(WebAppConfig.class);
		servletContext.addListener(new ContextLoaderListener(ctx));
		servletContext.setInitParameter("log4jConfigLocation", "classpath:log4j.properties");
		servletContext.setInitParameter("log4jRefreshInterval", "360000");
		servletContext.addListener(Log4jConfigListener.class);
		ctx.setServletContext(servletContext);
		Dynamic servlet = servletContext.addServlet("dispatcher",
				new DispatcherServlet(ctx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		log.info("--------------onStartup---------------");
	}

}