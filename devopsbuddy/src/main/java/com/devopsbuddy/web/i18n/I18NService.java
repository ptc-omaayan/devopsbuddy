package com.devopsbuddy.web.i18n;

import org.apache.tomcat.jni.Local;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * Created by omaayan on 12/1/2016.
 */
@Service
public class I18NService {
    private static final Logger LOG = LoggerFactory.getLogger(I18NService.class);

   @Autowired
   private MessageSource messageSource;

    public String getMessage(String messageId){
        LOG.info("Returning i18n text for messageId {}",messageId);
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId,locale);
    }

    private String getMessage(String messageId, Locale locale) {
        return messageSource.getMessage(messageId,null,locale);
    }
}
