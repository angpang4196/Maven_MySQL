package com.biz.mysql.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSource;

public class AddrDataFactory implements DataSourceFactory {

	Properties props;

	public void setProperties(Properties props) {
		this.props = props;
	}

	public DataSource getDataSource() {
		PooledDataSource ds = new PooledDataSource();

		/*
		 * DataSource가 DB에 연결하기 위한 PROFILE을 설정하는 부분
		 */

		ds.setDriver(props.getProperty("DRIVER"));
		ds.setUrl(props.getProperty("URL"));
		ds.setUsername(props.getProperty("USER"));
		ds.setPassword(props.getProperty("PASSWORD"));

		return ds;

	}

}
