package Problems.SplitWise;

import Problems.SplitWise.Models.Expense;
import Problems.SplitWise.Models.Group;
import Problems.SplitWise.Models.Split;
import Problems.SplitWise.Models.User;
import Problems.SplitWise.Service.ExpenseManager;

import java.util.ArrayList;
import java.util.List;

public class SplitWise {
    public static void main(String[] args) {
        ExpenseManager expenseManager = new ExpenseManager();

        User u1 = expenseManager.createUser("1","Jatin");
        User u2 = expenseManager.createUser("2","Gagan");
        User u3 = expenseManager.createUser("3","Inder");

        Group g1 = expenseManager.createGroup("1","Ooty Trip");
        g1.setUsers(List.of(u1,u2,u3));

        List<Split> splits = new ArrayList<>();
        splits.add(new Split(50.00,u1));
        splits.add(new Split(50.00,u2));

        Expense expense = new Expense();

    }
}
