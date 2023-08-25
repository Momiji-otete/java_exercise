public class Exercise2 {
  public String addString(String folder, String file) {
    if (!folder.endsWith("\\")) {
      folder += "\\";
    }
    return folder + file;
  }
}