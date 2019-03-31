package com.jc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jc.bo.YsrcpMebershipBo;

public class YsrcpMembershipDaoImpl implements YsrcpMembershipDao {

	private static final String INSERT_MEMBERS = "INSERT INTO YSRCPMEMBERSHIP VALUES(MEMENO.NEXTVAL,?,?,?,?,?,?0";

	private JdbcTemplate jt;

	public YsrcpMembershipDaoImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insertMembers(YsrcpMebershipBo ycpBo) {
		int count = 0;
		count = jt.update(INSERT_MEMBERS, ycpBo.getmName(), ycpBo.getVillage(), ycpBo.getMandal(),
				ycpBo.getConstitenucey(), ycpBo.getDistrict(), ycpBo.getMobile());
		return count;
	}

}
