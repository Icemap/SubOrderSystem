package com.gig.sub.order.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.gig.sub.order.bean.ResultBean;
import com.gig.sub.order.service.FileService;

@Service
public class FileServiceImpl implements FileService
{
	@Override
	public ResultBean fileUpload(MultipartFile file, String filePath)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultBean filesUpload(MultipartFile[] file, String filePath)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
