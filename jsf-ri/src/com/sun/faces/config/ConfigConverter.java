/*
 * $Id: ConfigConverter.java,v 1.3 2003/08/25 05:39:43 eburns Exp $
 */

/*
 * Copyright 2003 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.faces.config;


/**
 * <p>Config Bean for a Converter.</p>
 */
public class ConfigConverter extends ConfigFeature {

    private String converterId;
    public String getConverterId() {
        return (this.converterId);
    }
    public void setConverterId(String converterId) {
        this.converterId = converterId;
    }

    private String converterClass;
    public String getConverterClass() {
        return (this.converterClass);
    }
    public void setConverterClass(String converterClass) {
        this.converterClass = converterClass;
    }
    private String converterForClass;
    public String getConverterForClass() {
	return converterForClass;
    }
    public void setConverterForClass(String converterForClass) {
	this.converterForClass = converterForClass;
    }
}
