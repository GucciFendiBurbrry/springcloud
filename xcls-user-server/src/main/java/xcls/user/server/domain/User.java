package xcls.user.server.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class User implements Serializable {
	
	private static final long serialVersionUID = -8683436201034842116L;
	
	//未签订契约
	public static final Integer BONUS_NOT_SIGN = 0;
	//签订契约下级未同意
	public static final Integer BONUS_SIGN_NOT_AGREE = 1;
	//已签订契约下级同意
	public static final Integer BONUS_SIGN_AGREE = 2;
	//已签订契约有新契约
	public static final Integer BONUS_SIGN_NEW = 3;
	//已签订契约有新契约拒绝
	public static final Integer BONUS_SIGN_REJECT = 4;
	
	//没有配置日工资
	public static final Integer DAY_SALARY_NOT_EXIST = 0;
	//有配置日工资
	public static final Integer DAY_SALARY_EXIST = 1;
	//记住我默认值
	public static final String REMEMBERME_YES = "yes";
	
    private Integer id;
    /**
     * 业务系统代码
     */
    private String bizSystem;

    /**
     * 用户code
     */
    private Integer code;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 上级代理
     */
    private String regfrom;
    /**
     * 是否游客 0否  1是
     */
    private Integer isTourist;

    /**
     * 团队会员人数
     */
    private Integer teamMemberCount;

    /**
     * 直接下级人数
     */
    private Integer downMemberCount;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户安全密码，二次密码
     */
    private String safePassword;

    /**
     * 是否安全密码
     */
    private Integer haveSafePassword;

    /**
     * 是否有安全问题
     */
    private Integer haveSafeQuestion;
    /**
     * 呢称
     */
    private String nick;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 真实姓名
     */
    private String trueName;

    /**
     * 身份证号码
     */
    private String identityid;

    /**
     * 出生年月日
     */
    private String birthday;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * QQ
     */
    private String qq;

    /**
     * 头像    
     */
    private String headImg;
    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 地址
     */
    private String address;

    /**
     *注册时间
     */
    private Date addtime;
    
    /**
     * 首次充值时间
     */
    private Date firstRechargeTime;
    private Long firstRechargeOrderId;

    /**
     *登陆锁定
     */
    private Integer loginLock;

    /**
     *提现锁定
     */
    private Integer withdrawLock;

    /**
     *标识是否有效记录
     */
    private Integer state;

    /**
     *代理级别 
     */
    private String dailiLevel;

    /**
     *会员VIP等级
     */
    private String vipLevel;

    /**
     *用户星级 
     */
    private Integer starLevel;
    private String levelName;

    /**
     *电子邮件
     */
    private String email;

    /**
     *登录IP
     */
    private String logip;
    
    /**
     *登录IP
     */
    private String lastMobileLogin;

    /**
     *登陆次数
     */
    private Integer loginTimes;

    /**
     *上次退出时间
     */
    private Date lastLogoutTime;

    /**
     *上次登录时间
     */
    private Date lastLoginTime;

    /**
     *时时彩类奖金模式
     */
    private BigDecimal sscRebate;

    /**
     *分分彩奖金模式
     */
    private BigDecimal ffcRebate;

    /**
     *11选5类奖金模式
     */
    private BigDecimal syxwRebate;

    /**
    *快3类奖金模式
    */
    private BigDecimal ksRebate;

    /**
    *PK10奖金模式
    */
    private BigDecimal pk10Rebate;

    /**
    *低频彩奖金模式
    */
    private BigDecimal dpcRebate;

    /**
    *骰宝奖金模式
    */
    private BigDecimal tbRebate;

    /**
    *快乐十分类奖金模式
    */
    private BigDecimal klsfRebate;
    
    /**
    *六合彩奖金模式
    */
    private BigDecimal lhcRebate;

    /**
     * 幸运28奖金模式
     */
    private BigDecimal xyebRebate;
    
    /**
    *积分
    */
    private BigDecimal point;

    /**
    *分红比例(总代的会员才会有该值,直属的分红比例由系统的最高配置决定)
    */
    private BigDecimal bonusScale;
    
    /**
     *分红契约签订状态
     */
     private Integer bonusState;
     
     /**
      * 日工资状态
      */
     private Integer salaryState;

    /**
    *版本号
    */
    private Integer version;

    /**
    *全部金额
    */
    private BigDecimal money;

    /**
    *可用余额
    */
    private BigDecimal canWithdrawMoney;

    /**
    *冻结金额
    */
    private BigDecimal iceMoney;

    /**
    *总可提现的额度
    */
    private BigDecimal totalCanWithdrawMoney;
    
    
    
    public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	
	//扩展字段
    private Integer isOnline; //当前是否在线
    private Integer rebateCount ;//模式统计相应的人数
    private String operationType;  //操作类型,增加还是减少
    private String operationValue; //操作值
    private Integer numberOfLower; //会员的下级人数
    private BigDecimal totalGain;  //总共盈利
    
    private String checkCode;  //验证码
    private String surePassword; //确认密码
    private String oldPassword; //旧密码
    private String loginType; //登录方式   手机或者pc
    
    private String oldSafePassword; //旧安全密码
    private String sureSafePassword; //确认安全密码
    
    private BigDecimal accountValue;//到帐金额
    private String rememberme; //登录记住我
    
    public User() {
		
	}

    public User(String userName){
    	this.userName = userName;
    }
    
    public User(String userName,String userpass){
    	this.userName = userName;
    	this.password = userpass;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    
    public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getFirstRechargeOrderId() {
		return firstRechargeOrderId;
	}

	public void setFirstRechargeOrderId(Long firstRechargeOrderId) {
		this.firstRechargeOrderId = firstRechargeOrderId;
	}

	public Integer getRebateCount() {
		return rebateCount;
	}

	public void setRebateCount(Integer rebateCount) {
		this.rebateCount = rebateCount;
	}

	public String getBizSystem() {
        return bizSystem;
    }

    public void setBizSystem(String bizSystem) {
        this.bizSystem = bizSystem == null ? null : bizSystem.trim();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRegfrom() {
        return regfrom;
    }

    public void setRegfrom(String regfrom) {
        this.regfrom = regfrom == null ? null : regfrom.trim();
    }

    public Integer getIsTourist() {
		return isTourist;
	}

	public void setIsTourist(Integer isTourist) {
		this.isTourist = isTourist;
	}

	public Integer getTeamMemberCount() {
        return teamMemberCount;
    }

    public void setTeamMemberCount(Integer teamMemberCount) {
        this.teamMemberCount = teamMemberCount;
    }

    public Integer getDownMemberCount() {
        return downMemberCount;
    }

    public void setDownMemberCount(Integer downMemberCount) {
        this.downMemberCount = downMemberCount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSafePassword() {
        return safePassword;
    }

    public void setSafePassword(String safePassword) {
        this.safePassword = safePassword == null ? null : safePassword.trim();
    }

    public Integer getHaveSafePassword() {
        return haveSafePassword;
    }

    public void setHaveSafePassword(Integer haveSafePassword) {
        this.haveSafePassword = haveSafePassword;
    }

    public Integer getHaveSafeQuestion() {
        return haveSafeQuestion;
    }

    public void setHaveSafeQuestion(Integer haveSafeQuestion) {
        this.haveSafeQuestion = haveSafeQuestion;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    public String getIdentityid() {
        return identityid;
    }

    public void setIdentityid(String identityid) {
        this.identityid = identityid == null ? null : identityid.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
    
    public Date getFirstRechargeTime() {
        return firstRechargeTime;
    }

    public void setFirstRechargeTime(Date firstRechargeTime) {
        this.firstRechargeTime = firstRechargeTime;
    }

    public Integer getLoginLock() {
        return loginLock;
    }

    public void setLoginLock(Integer loginLock) {
        this.loginLock = loginLock;
    }

    public Integer getWithdrawLock() {
        return withdrawLock;
    }

    public void setWithdrawLock(Integer withdrawLock) {
        this.withdrawLock = withdrawLock;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDailiLevel() {
        return dailiLevel;
    }

    public void setDailiLevel(String dailiLevel) {
        this.dailiLevel = dailiLevel == null ? null : dailiLevel.trim();
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel == null ? null : vipLevel.trim();
    }

    public Integer getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLogip() {
        return logip;
    }

    public void setLogip(String logip) {
        this.logip = logip == null ? null : logip.trim();
    }

    public String getLastMobileLogin() {
		return lastMobileLogin;
	}

	public void setLastMobileLogin(String lastMobileLogin) {
		this.lastMobileLogin = lastMobileLogin == null ? null : lastMobileLogin.trim();
	}

	public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public Date getLastLogoutTime() {
        return lastLogoutTime;
    }

    public void setLastLogoutTime(Date lastLogoutTime) {
        this.lastLogoutTime = lastLogoutTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public BigDecimal getSscRebate() {
        return sscRebate;
    }

    public void setSscRebate(BigDecimal sscRebate) {
        this.sscRebate = sscRebate;
    }

    public BigDecimal getFfcRebate() {
        return ffcRebate;
    }

    public void setFfcRebate(BigDecimal ffcRebate) {
        this.ffcRebate = ffcRebate;
    }

    public BigDecimal getSyxwRebate() {
        return syxwRebate;
    }

    public void setSyxwRebate(BigDecimal syxwRebate) {
        this.syxwRebate = syxwRebate;
    }

    public BigDecimal getKsRebate() {
        return ksRebate;
    }

    public void setKsRebate(BigDecimal ksRebate) {
        this.ksRebate = ksRebate;
    }

    public BigDecimal getPk10Rebate() {
        return pk10Rebate;
    }

    public void setPk10Rebate(BigDecimal pk10Rebate) {
        this.pk10Rebate = pk10Rebate;
    }

    public BigDecimal getDpcRebate() {
        return dpcRebate;
    }

    public void setDpcRebate(BigDecimal dpcRebate) {
        this.dpcRebate = dpcRebate;
    }

    public BigDecimal getTbRebate() {
        return tbRebate;
    }

    public void setTbRebate(BigDecimal tbRebate) {
        this.tbRebate = tbRebate;
    }

    public BigDecimal getKlsfRebate() {
        return klsfRebate;
    }

    public void setKlsfRebate(BigDecimal klsfRebate) {
        this.klsfRebate = klsfRebate;
    }

    public BigDecimal getLhcRebate() {
        return lhcRebate;
    }

    public void setLhcRebate(BigDecimal lhcRebate) {
        this.lhcRebate = lhcRebate;
    }

    public BigDecimal getXyebRebate() {
		return xyebRebate;
	}

	public void setXyebRebate(BigDecimal xyebRebate) {
		this.xyebRebate = xyebRebate;
	}

	public BigDecimal getPoint() {
        return point;
    }

    public void setPoint(BigDecimal point) {
        this.point = point;
    }

    public BigDecimal getBonusScale() {
        return bonusScale;
    }

    public void setBonusScale(BigDecimal bonusScale) {
        this.bonusScale = bonusScale;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getCanWithdrawMoney() {
        return canWithdrawMoney;
    }

    public void setCanWithdrawMoney(BigDecimal canWithdrawMoney) {
        this.canWithdrawMoney = canWithdrawMoney;
    }

    public BigDecimal getIceMoney() {
        return iceMoney;
    }

    public void setIceMoney(BigDecimal iceMoney) {
        this.iceMoney = iceMoney;
    }

    public BigDecimal getTotalCanWithdrawMoney() {
        return totalCanWithdrawMoney;
    }

    public void setTotalCanWithdrawMoney(BigDecimal totalCanWithdrawMoney) {
        this.totalCanWithdrawMoney = totalCanWithdrawMoney;
    }

	public Integer getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOperationValue() {
		return operationValue;
	}

	public void setOperationValue(String operationValue) {
		this.operationValue = operationValue;
	}

	public Integer getNumberOfLower() {
		return numberOfLower;
	}

	public void setNumberOfLower(Integer numberOfLower) {
		this.numberOfLower = numberOfLower;
	}

	public BigDecimal getTotalGain() {
		return totalGain;
	}

	public void setTotalGain(BigDecimal totalGain) {
		this.totalGain = totalGain;
	}

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getSurePassword() {
		return surePassword;
	}

	public void setSurePassword(String surePassword) {
		this.surePassword = surePassword;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	
 

	public Integer getBonusState() {
		return bonusState;
	}

	public void setBonusState(Integer bonusState) {
		this.bonusState = bonusState;
	}
	
	public Integer getSalaryState() {
        return salaryState;
    }

    public void setSalaryState(Integer salaryState) {
        this.salaryState = salaryState;
    }

	public String getOldSafePassword() {
		return oldSafePassword;
	}

	public void setOldSafePassword(String oldSafePassword) {
		this.oldSafePassword = oldSafePassword;
	}

	public String getSureSafePassword() {
		return sureSafePassword;
	}

	public void setSureSafePassword(String sureSafePassword) {
		this.sureSafePassword = sureSafePassword;
	}

	public BigDecimal getAccountValue() {
		return accountValue;
	}

	public void setAccountValue(BigDecimal accountValue) {
		this.accountValue = accountValue;
	}

	public String getRememberme() {
		return rememberme;
	}

	public void setRememberme(String rememberme) {
		this.rememberme = rememberme;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", bizSystem=" + bizSystem + ", code=" + code + ", userName=" + userName
				+ ", regfrom=" + regfrom + ", isTourist=" + isTourist + ", teamMemberCount=" + teamMemberCount
				+ ", downMemberCount=" + downMemberCount + ", password=" + password + ", safePassword=" + safePassword
				+ ", haveSafePassword=" + haveSafePassword + ", haveSafeQuestion=" + haveSafeQuestion + ", nick=" + nick
				+ ", phone=" + phone + ", trueName=" + trueName + ", identityid=" + identityid + ", birthday="
				+ birthday + ", sex=" + sex + ", qq=" + qq + ", headImg=" + headImg + ", province=" + province
				+ ", city=" + city + ", address=" + address + ", addtime=" + addtime + ", firstRechargeTime="
				+ firstRechargeTime + ", firstRechargeOrderId=" + firstRechargeOrderId + ", loginLock=" + loginLock
				+ ", withdrawLock=" + withdrawLock + ", state=" + state + ", dailiLevel=" + dailiLevel + ", vipLevel="
				+ vipLevel + ", starLevel=" + starLevel + ", levelName=" + levelName + ", email=" + email + ", logip="
				+ logip + ", lastMobileLogin=" + lastMobileLogin + ", loginTimes=" + loginTimes + ", lastLogoutTime="
				+ lastLogoutTime + ", lastLoginTime=" + lastLoginTime + ", sscRebate=" + sscRebate + ", ffcRebate="
				+ ffcRebate + ", syxwRebate=" + syxwRebate + ", ksRebate=" + ksRebate + ", pk10Rebate=" + pk10Rebate
				+ ", dpcRebate=" + dpcRebate + ", tbRebate=" + tbRebate + ", klsfRebate=" + klsfRebate + ", lhcRebate="
				+ lhcRebate + ", xyebRebate=" + xyebRebate + ", point=" + point + ", bonusScale=" + bonusScale
				+ ", bonusState=" + bonusState + ", salaryState=" + salaryState + ", version=" + version + ", money="
				+ money + ", canWithdrawMoney=" + canWithdrawMoney + ", iceMoney=" + iceMoney
				+ ", totalCanWithdrawMoney=" + totalCanWithdrawMoney + ", isOnline=" + isOnline + ", rebateCount="
				+ rebateCount + ", operationType=" + operationType + ", operationValue=" + operationValue
				+ ", numberOfLower=" + numberOfLower + ", totalGain=" + totalGain + ", checkCode=" + checkCode
				+ ", surePassword=" + surePassword + ", oldPassword=" + oldPassword + ", loginType=" + loginType
				+ ", oldSafePassword=" + oldSafePassword + ", sureSafePassword=" + sureSafePassword + ", accountValue="
				+ accountValue + ", rememberme=" + rememberme + "]";
	}
	
	

}