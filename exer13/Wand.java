public class Wand {
  private String name;
  private double power;
  
  public String getName() { return this.name; }
  public void setName(String name) {
    if (name == null || name.length() < 3) {
      throw new IllegalArgumentException("名前がnullまたは2文字以下のため処理を中断");
    }
    this.name = name;
  }
  
  public double getPower() { return this.power; }
  public void setPower(double power) {
    if (power < 0.5 || power > 100.0) {
      throw new IllegalArgumentException("魔力が0.5以下または100より大きいため処理を中断");
    }
    this.power = power;
  }
}