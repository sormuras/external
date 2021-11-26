import java.io.PrintWriter;
import java.util.List;
import java.util.spi.ToolProvider;

public class JAcquire implements ToolProvider {
  public static void main(String... args) {
    System.exit(new JAcquire().run(System.out, System.err, args));
  }

  @Override
  public String name() {
    return "jacquire";
  }

  @Override
  public int run(PrintWriter out, PrintWriter err, String... args) {
    System.out.println("arguments  " + List.of(args));
    System.out.println("user.dir   " + System.getProperty("user.dir"));
    return 0;
  }
}
