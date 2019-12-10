package com.manthan.resumefinder.dao;

import java.io.File;

import com.manthan.resumefinder.bean.ResumeBean;

public interface ReadFileDAO {

	public ResumeBean readPdf(String search, File f);
	
	public ResumeBean readDoc(String search,File f );
}
