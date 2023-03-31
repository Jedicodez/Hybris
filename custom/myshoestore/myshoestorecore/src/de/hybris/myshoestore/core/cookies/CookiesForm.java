package de.hybris.myshoestore.core.cookies;

public class CookiesForm {

    private Integer pkgId;
    private String name;
    private Integer MRP;
    private String mfgBy;

    public Integer getPkgId() {
        return pkgId;
    }

    public void setPkgId(Integer pkgId) {
        this.pkgId = pkgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMRP() {
        return MRP;
    }

    public void setMRP(Integer MRP) {
        this.MRP = MRP;
    }

    public String getMfgBy() {
        return mfgBy;
    }

    public void setMfgBy(String mfgBy) {
        this.mfgBy = mfgBy;
    }
}
