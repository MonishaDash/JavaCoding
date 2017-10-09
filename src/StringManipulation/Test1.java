package test;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class Test1 {

	private static final Map<Integer, Map<String, Object>> USER_DETAILS_CACHE = new ConcurrentHashMap<Integer, Map<String, Object>>();

	private static final String USER_ID = "userId";

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.doViewAccountDetails(123);

	}
	private void loadUserData(final Map<String, Object> userData) {

		try {

			if (userData.containsKey(USER_ID)) {
				Integer userId = (Integer) userData.get(USER_ID);

				// Check to see if the user details are in the cache
				if (USER_DETAILS_CACHE.containsKey(userId)) {
					userData.putAll(USER_DETAILS_CACHE.get(userId));
				}else {
					userId = Integer.valueOf("12345");
					userData.put(USER_ID, userId);
					userData.put("username", "abmishra");
					userData.put("firstName", "Abhishek");
					userData.put("lastName","Mishra");
					userData.put("password","password1");
					USER_DETAILS_CACHE.put(userId, userData);

				}

			} 
		} catch (final Exception ex) {

		}

	}

	private void doViewAccountDetails(Integer userId ) {
		if (userId == null) {
			System.out.println("Invalid Data");

		} else {
			final Map<String, Object> userData = new HashMap<String, Object>();
			userData.put(USER_ID, userId);
			loadUserData(userData);
			System.out.println(userData);
			saveUserData(userData);

		}
	}
	
    private void saveUserData(final Map<String, Object> userData) {
        final StringBuffer buffer = new StringBuffer().append("INSERT INTO users(first_name, last_name, \"password\", phone, salary, username) VALUES (");

        final SortedSet<String> keys = new TreeSet<String>(userData.keySet());
        final Iterator<String> keyItor = keys.iterator();
        boolean first = true;
        while (keyItor.hasNext()) {
            final String key = keyItor.next();
            if (first) {
                first = false;
            } else {
                buffer.append(", ");
            }
            buffer.append('\'');
            buffer.append(userData.get(key));
            buffer.append('\'');
        }
        buffer.append(')');

        try {
            final String sql = buffer.toString();
            System.out.println(sql);

        } catch (final Exception ex) {

        }
    }
}
