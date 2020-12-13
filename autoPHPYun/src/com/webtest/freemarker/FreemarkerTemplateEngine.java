package com.webtest.freemarker;

import java.io.File;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerTemplateEngine {
	private static final String DEFAULT_TEMPLATE = "template.html";

	public String getTemplatePath() {
		return "C:\\javaworkplace\\autoPHPYun\\conf";
	}

	public String run(Map<String, Object> context) throws Exception {
		return executeFreemarker(context);
	}

	private String executeFreemarker(Map<String, Object> context) throws Exception {

		Configuration configuration = new Configuration(Configuration.VERSION_2_3_29);
		configuration.setDirectoryForTemplateLoading(new File(getTemplatePath()));
		configuration.setEncoding(Locale.CHINA, "UTF-8");
		configuration.setLogTemplateExceptions(false);
		configuration.setWrapUncheckedExceptions(true);

		configuration.setCacheStorage(new freemarker.cache.MruCacheStorage(20, 250));
		Template template = configuration.getTemplate(getTemplate());

		StringWriter out = new StringWriter();
		template.process(context, out);
		System.out.print(out.toString());
		return out.toString();
	}

	public String getTemplate() {
		// TODO Auto-generated method stub
		return DEFAULT_TEMPLATE;
	}
}
