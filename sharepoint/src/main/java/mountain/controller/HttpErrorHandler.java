package mountain.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

@Component
public class HttpErrorHandler implements HandlerExceptionResolver {
	

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		System.out.println(ex.getMessage());
		ex.printStackTrace();
		String message = "Unexpected Exception";
		ModelAndView modelAndView = null;
		if (ex instanceof NoSuchRequestHandlingMethodException) {
			message = "Page not found";
			modelAndView = new ModelAndView("404");
		} else {
			message = ex.getMessage();
			modelAndView = new ModelAndView("exception");
		}
		/***  SpringMVC自定义异常对应的status code
        Exception	                   HTTP Status Code
		ConversionNotSupportedException	        500 (Internal Server Error)
		HttpMediaTypeNotAcceptableException	    406 (Not Acceptable)
		HttpMediaTypeNotSupportedException	    415 (Unsupported Media Type)
		HttpMessageNotReadableException	        400 (Bad Request)
		HttpMessageNotWritableException	        500 (Internal Server Error)
		HttpRequestMethodNotSupportedException	405 (Method Not Allowed)
		MissingServletRequestParameterException	400 (Bad Request)
		NoSuchRequestHandlingMethodException	404 (Not Found)
		TypeMismatchException	                400 (Bad Request)
		*/
		modelAndView.addObject("message", message);
		return modelAndView;
	}
}
