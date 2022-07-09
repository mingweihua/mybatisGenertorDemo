package cn.sysu.pojo;

public class ZkChange {
    private Integer id;

    private String holecode;

    private Double x;

    private Double y;

    private Double height;

    private String waterheight;

    private Integer levelnum;

    private Double bottomheight;

    private Double thickness;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHolecode() {
        return holecode;
    }

    public void setHolecode(String holecode) {
        this.holecode = holecode == null ? null : holecode.trim();
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getWaterheight() {
        return waterheight;
    }

    public void setWaterheight(String waterheight) {
        this.waterheight = waterheight == null ? null : waterheight.trim();
    }

    public Integer getLevelnum() {
        return levelnum;
    }

    public void setLevelnum(Integer levelnum) {
        this.levelnum = levelnum;
    }

    public Double getBottomheight() {
        return bottomheight;
    }

    public void setBottomheight(Double bottomheight) {
        this.bottomheight = bottomheight;
    }

    public Double getThickness() {
        return thickness;
    }

    public void setThickness(Double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", holecode=").append(holecode);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", height=").append(height);
        sb.append(", waterheight=").append(waterheight);
        sb.append(", levelnum=").append(levelnum);
        sb.append(", bottomheight=").append(bottomheight);
        sb.append(", thickness=").append(thickness);
        sb.append("]");
        return sb.toString();
    }
}