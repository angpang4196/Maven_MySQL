package com.biz.mysql.dao;

import java.util.List;

import com.biz.mysql.vo.AddrVO;

public interface AddrDao {

	public List<AddrVO> selectAll();

	public List<AddrVO> findByName(String name);

	public int insert(AddrVO vo);

	public int update(AddrVO vo);

	public int delete(long id);

}
