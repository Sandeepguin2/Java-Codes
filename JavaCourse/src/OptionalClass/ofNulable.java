package OptionalClass;
//if there is no value inside the optional object then it will show [Optional.empty] instead of nullpointer exception
import java.util.Optional;

public class ofNulable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> name=Optional.ofNullable(null);
		System.out.println(name);

	}

}
