import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {
    public static void main(String[] args)  {
        OptionParser parser = new OptionParser();
        
        parser.accepts("flow_id").withRequiredArg();
        parser.accepts("running");
        parser.accepts("failure");
        parser.accepts("success");
        parser.accepts("finished").requiredIf("failure").requiredIf("success");
        parser.accepts("process_name").withRequiredArg();

        OptionSet options = parser.parse( "-flow_id=asdas","-finished","-process_name=asdsad");

        System.out.println(options.valueOf("flow_id"));
        System.out.println(options.has("failure"));
    }
}
