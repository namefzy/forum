package cn.com.cncp.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_country")
public class Country implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "country_name")
    private String countryName;

    /**
     * 代码
     */
    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "country_num")
    private Integer countryNum;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return country_name - 名称
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置名称
     *
     * @param countryName 名称
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 获取代码
     *
     * @return country_code - 代码
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置代码
     *
     * @param countryCode 代码
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return country_num
     */
    public Integer getCountryNum() {
        return countryNum;
    }

    /**
     * @param countryNum
     */
    public void setCountryNum(Integer countryNum) {
        this.countryNum = countryNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", countryName=").append(countryName);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", countryNum=").append(countryNum);
        sb.append("]");
        return sb.toString();
    }
}