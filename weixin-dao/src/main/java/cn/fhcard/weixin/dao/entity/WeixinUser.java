package cn.fhcard.weixin.dao.entity;

import java.util.Date;

import org.apache.ibatis.type.JdbcType;

import com.codefarm.mybatis.orm.annotations.Column;
import com.codefarm.mybatis.orm.annotations.Entity;
import com.codefarm.mybatis.orm.annotations.GeneratedValue;
import com.codefarm.mybatis.orm.annotations.GenerationType;
import com.codefarm.mybatis.orm.annotations.Id;
import com.codefarm.mybatis.orm.annotations.Table;

import cn.fhcard.weixin.dao.WeixinUserMapper;
import cn.fhcard.weixin.enums.Sex;
import cn.fhcard.weixin.enums.Subscribe;

@Entity(mapper = WeixinUserMapper.class)
@Table(name = "WEIXINUSER")
public class WeixinUser
{
    @Id(column = "userid", jdbcType = JdbcType.BIGINT)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, sequence = "WEIXIN_SEQ")
    private Long userId;
    
    /**
     * 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息，只有openid和UnionID（在该公众号绑定到了微信开放平台账号时才有）
     */
    @Column(name = "subscribe", jdbcType = JdbcType.BIT)
    private Subscribe subscribe = Subscribe.NO;
    
    /**
     * 用户的标识，对当前公众号唯一
     */
    @Column(name = "openId", jdbcType = JdbcType.VARCHAR)
    private String openId;
    
    /**
     * 用户的昵称
     */
    @Column(name = "nickName", jdbcType = JdbcType.VARCHAR)
    private String nickName;
    
    /**
     * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知 
     */
    @Column(name = "sex", jdbcType = JdbcType.INTEGER)
    private Sex sex = Sex.UNKNOWN;
    
    /**
     * 用户所在城市
     */
    @Column(name = "city", jdbcType = JdbcType.VARCHAR)
    private String city;
    
    /**
     * 用户所在国家 
     */
    @Column(name = "country", jdbcType = JdbcType.VARCHAR)
    private String country;
    
    /**
     * 用户所在省份 
     */
    @Column(name = "province", jdbcType = JdbcType.VARCHAR)
    private String province;
    
    /**
     * 用户的语言，简体中文为zh_CN 
     */
    @Column(name = "language", jdbcType = JdbcType.VARCHAR)
    private String language;
    
    /**
     * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效
     */
    @Column(name = "headimgurl", jdbcType = JdbcType.VARCHAR)
    private String headImgUrl;
    
    /**
     * 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间 
     */
    @Column(name = "subscribetime", jdbcType = JdbcType.TIMESTAMP)
    private Date subscribeTime;
    
    /**
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段
     */
    @Column(name = "unionid", jdbcType = JdbcType.VARCHAR)
    private String unionId;
    
    /**
     * 公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注 
     */
    @Column(name = "remark", jdbcType = JdbcType.VARCHAR)
    private String remark;
    
    /**
     * 用户所在的分组ID 
     */
    @Column(name = "groupid", jdbcType = JdbcType.VARCHAR)
    private String groupId;
    
    /**
     * 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom） 
     */
    @Column(name = "privilege", jdbcType = JdbcType.VARCHAR)
    private String privilege;
    
    public Subscribe getSubscribe()
    {
        return subscribe;
    }
    
    public void setSubscribe(Subscribe subscribe)
    {
        this.subscribe = subscribe;
    }
    
    public String getOpenId()
    {
        return openId;
    }
    
    public void setOpenId(String openId)
    {
        this.openId = openId;
    }
    
    public String getNickName()
    {
        return nickName;
    }
    
    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }
    
    public Sex getSex()
    {
        return sex;
    }
    
    public void setSex(Sex sex)
    {
        this.sex = sex;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public String getCountry()
    {
        return country;
    }
    
    public void setCountry(String country)
    {
        this.country = country;
    }
    
    public String getProvince()
    {
        return province;
    }
    
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    public String getLanguage()
    {
        return language;
    }
    
    public void setLanguage(String language)
    {
        this.language = language;
    }
    
    public String getHeadImgUrl()
    {
        return headImgUrl;
    }
    
    public void setHeadImgUrl(String headImgUrl)
    {
        this.headImgUrl = headImgUrl;
    }
    
    public Date getSubscribeTime()
    {
        return subscribeTime;
    }
    
    public void setSubscribeTime(Date subscribeTime)
    {
        this.subscribeTime = subscribeTime;
    }
    
    public String getUnionId()
    {
        return unionId;
    }
    
    public void setUnionId(String unionId)
    {
        this.unionId = unionId;
    }
    
    public String getRemark()
    {
        return remark;
    }
    
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
    public String getGroupId()
    {
        return groupId;
    }
    
    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }
    
    public String getPrivilege()
    {
        return privilege;
    }
    
    public void setPrivilege(String privilege)
    {
        this.privilege = privilege;
    }
    
    public Long getUserId()
    {
        return userId;
    }
    
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }
    
    @Override
    public String toString()
    {
        return "WeixinUser [userId=" + userId + ", subscribe=" + subscribe
                + ", openId=" + openId + ", nickName=" + nickName + ", sex="
                + sex + ", city=" + city + ", country=" + country
                + ", province=" + province + ", language=" + language
                + ", headImgUrl=" + headImgUrl + ", subscribeTime="
                + subscribeTime + ", unionId=" + unionId + ", remark=" + remark
                + ", groupId=" + groupId + ", privilege=" + privilege + "]";
    }
}
