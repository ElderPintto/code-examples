import mercadopago.MP;
import java.util.Map;
import java.util.HashMap;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.json.JSONArray;

public class MyClass {
	public static void main (String args[]) {
		MP mp = new MP ("ACCESS_TOKEN");

		Map<String, Object> filters = new HashMap<String, Object> ();
		filters.put("email", "your.payer@email");

		JSONObject customer = mp.get ("/v1/customers/search", filters);

		System.out.println(customer.getJSONObject("response").getJSONArray("cards").toString());
	}
}