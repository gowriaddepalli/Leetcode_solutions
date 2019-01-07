/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        
        if(employees.size() == 0){
            return 0;
        }
        
        HashMap<Integer,Employee> ht = new HashMap<Integer, Employee>();
        for(Employee e: employees)
        {
            ht.put(e.id, e);
        }
        return recursiveImp(ht,id);
    }
    
    
    public int recursiveImp(HashMap<Integer,Employee> ht, int id){
        Employee e = ht.get(id);
        int totalImp = e.importance;
        for(int j: e.subordinates){
            totalImp += recursiveImp(ht, j);
        }
        return totalImp;
    }
}
