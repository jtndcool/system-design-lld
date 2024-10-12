package Problems.SplitWise.Service;

import Problems.SplitWise.Models.Group;
import Problems.SplitWise.Models.User;

import java.util.HashMap;
import java.util.Map;

public class ExpenseManager {
    Map<String, User> users;
    Map<String, Group> groups;

    public ExpenseManager(){
        users = new HashMap<>();
        groups = new HashMap<>();
    }

    public User createUser(String id, String name){
        User user = new User();
        user.setUserId(id);
        user.setName(name);
        users.put(id,user);
        return user;
    }

    public Group createGroup(String groupId, String groupName) {
        Group group = new Group();
        group.setGroupId(groupId);
        group.setGroupName(groupName);
        groups.put(groupId, group);
        return group;
    }
}
