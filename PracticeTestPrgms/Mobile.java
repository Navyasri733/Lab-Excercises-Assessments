package PracticeTestPrgms;

import java.util.ArrayList;
import java.util.HashMap;

public class Mobile {
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

	public String addmobile(String company, String model) {
		ArrayList<String> list = null;

		if (mobiles.containsKey(company)) {
			list = mobiles.get(company);
		} else {
			list = new ArrayList<String>();
		}
		list.add(model);
		mobiles.put(company, list);
		return "model successfully added";

	}

	public ArrayList<String> getModels(String company) {
		if (mobiles.containsKey(company)) {
			return mobiles.get(company);
		} else {
			return null;
		}

	}

	public String buyMobile(String company, String model) {
		if (mobiles.containsKey(company)) {
			ArrayList<String> list = mobiles.get(company);
			boolean flag = false;
			for (String s : list) {
				if (s.equals(model)) {
					list.remove(s);
					flag = true;
					break;
				}
			}
			mobiles.put(company, list);
			if (flag)

				return "mobile sold successfully";

			else
				return "item not available";

		}

		return "item not available";

	}

}
