class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {

        //https://leetcode.com/problems/accounts-merge/

        // Sort the accounts based on the size in descending order
        // Collections.sort(accounts, (a, b) -> (b.size() - a.size()));
        // int groupCtr = 0;

        // // Create a map to associate each email with a group number
        // HashMap<String, Integer> emailGroup = new HashMap<>();
        // // Create a map to associate each group with a sorted set of emails
        // HashMap<Integer, TreeSet<String>> groupMap = new HashMap<>();
        // // Create a map to store the name associated with each group
        // HashMap<Integer, String> nameMap = new HashMap<>();

        // for (List<String> account : accounts) {
        //     Set<String> assigned = new HashSet<>();
        //     Set<String> unassigned = new HashSet<>();
        //     int defaultGroup = -1;
        //     String name = null;

        //     for (int i = 0; i < account.size(); i++) {
        //         if (i == 0) {
        //             // The first element is the name, save it
        //             name = account.get(i);
        //             continue;
        //         }
        //         String email = account.get(i);
        //         // Classify emails into those already assigned to a group and those not
        //         if (emailGroup.containsKey(email)) {
        //             assigned.add(email);
        //         } else {
        //             unassigned.add(email);
        //         }
        //     }

        //     if (assigned.isEmpty()) {
        //         // If no emails are assigned to a group, create a new group
        //         defaultGroup = groupCtr++;
        //     } else {
        //         // Merge all groups that have at least one common email
        //         Set<Integer> gIds = new HashSet<>();
        //         for (String email : assigned) {
        //             gIds.add(emailGroup.get(email));
        //         }

        //         // Select one of the groups to merge into
        //         defaultGroup = gIds.iterator().next();

        //         // Merge groups if there are multiple groups
        //         if (gIds.size() > 1) {
        //             for (String email : assigned) {
        //                 Integer gId = emailGroup.get(email);
        //                 if (gId != defaultGroup) {
        //                     if (groupMap.containsKey(gId)) {
        //                         // Update email-group mappings and merge email sets
        //                         for (String email2 : groupMap.get(gId)) {
        //                             emailGroup.put(email2, defaultGroup);
        //                         }
        //                         groupMap.get(defaultGroup).addAll(groupMap.get(gId));
        //                         groupMap.remove(gId);
        //                     }
        //                 }
        //             }
        //         }
        //     }

        //     // Add new emails to the group
        //     groupMap.putIfAbsent(defaultGroup, new TreeSet<>());
        //     for (String email : unassigned) {
        //         emailGroup.put(email, defaultGroup);
        //         groupMap.get(defaultGroup).add(email);
        //     }
        //     // Map the group to the name
        //     nameMap.put(defaultGroup, name);
        // }

        // // Prepare the final result
        // List<List<String>> result = new ArrayList<>();
        // for (Integer gId : groupMap.keySet()) {
        //     List<String> row = new ArrayList<>();
        //     // Add the name and emails to each list
        //     row.add(nameMap.get(gId));
        //     row.addAll(groupMap.get(gId));
        //     result.add(row);
        // }

        // return result;



        //DFS
         Map<String, Set<String>> graph = new HashMap<>();  //<email node, neighbor nodes>
        Map<String, String> owner = new HashMap<>();        //<email, username>
        
         // Build the graph;
        for (List<String> account : accounts) {
            String userName = account.get(0);
            Set<String> neighbors = new HashSet<>(account);
            neighbors.remove(userName);
            
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                if (!graph.containsKey(email)) {
                    graph.put(email, new HashSet<>());
                }
                graph.get(email).addAll(neighbors);
                owner.put(email, userName);
            }
        }
        
        Set<String> visited = new HashSet<>();
        List<List<String>> results = new ArrayList<>();
        // DFS search the graph;
         for (String email : owner.keySet()) {
             if (!visited.contains(email)) {
                List<String> result = new ArrayList<>();
                dfs(graph, email, visited, result);
                Collections.sort(result);
                result.add(0, owner.get(email));
                results.add(result);
             }
         }
        
        
        return results;
    }
    
    public void dfs(Map<String, Set<String>> graph, String email, Set<String> visited, List<String> list) {
        list.add(email);
        visited.add(email);
        for (String neighbor: graph.get(email)) {
            if (!visited.contains(neighbor)) {
                dfs(graph, neighbor, visited, list);    
            }
        }


    }
}