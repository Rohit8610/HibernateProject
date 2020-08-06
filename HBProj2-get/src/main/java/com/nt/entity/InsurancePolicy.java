package com.nt.entity;

import java.io.Serializable;

public final class InsurancePolicy implements Serializable,IinsurancePolicy {
private Long  PolicyId;
private String PolicyName;
private String PolicyType;
private String Company;
private Integer Tenure;
public Long getPolicyId() {
	return PolicyId;
}
public void setPolicyId(Long policyId) {
	PolicyId = policyId;
}
public String getPolicyName() {
	return PolicyName;
}
public void setPolicyName(String policyName) {
	PolicyName = policyName;
}
public String getPolicyType() {
	return PolicyType;
}
public void setPolicyType(String policyType) {
	PolicyType = policyType;
}
public String getCompany() {
	return Company;
}
public void setCompany(String company) {
	Company = company;
}
public Integer getTenure() {
	return Tenure;
}
public void setTenure(Integer tenure) {
	Tenure = tenure;
}
@Override
public String toString() {
	return "InsurancePolicy [PolicyId=" + PolicyId + ", PolicyName=" + PolicyName + ", PolicyType=" + PolicyType
			+ ", Company=" + Company + ", Tenure=" + Tenure + "]";
}


}
