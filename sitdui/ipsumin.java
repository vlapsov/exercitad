import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

public class TemplateLoaderExample {
    public static void main(String[] args) {
        // Create the configuration instance
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_31);

        // Set the class loader for loading templates from the classpath
        ClassTemplateLoader classLoader = new ClassTemplateLoader(TemplateLoaderExample.class, "/templates");
        cfg.setTemplateLoader(classLoader);

        // Set additional configuration settings
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        cfg.setLogTemplateExceptions(false);
        cfg.setWrapUncheckedExceptions(true);
        
        // Now you can load a template and process it
        // ...
    }
}
