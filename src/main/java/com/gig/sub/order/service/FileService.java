package com.gig.sub.order.service;

import org.springframework.web.multipart.MultipartFile;

import com.gig.sub.order.bean.ResultBean;

public interface FileService
{
	ResultBean fileUpload(MultipartFile file, String filePath);
	ResultBean filesUpload(MultipartFile[] file, String filePath);
}
