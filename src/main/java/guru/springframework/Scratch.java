package guru.springframework;

/**
 * @author klein
 */
public class Scratch {
  private String comment;

  public Scratch(String comment) {
    setComment(comment);
  }

  private void setComment(String comment) {
    this.comment = comment;
  }

  public String getComment(){
    return comment;
  }
}
