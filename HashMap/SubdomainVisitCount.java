class Solution {
     public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap();
        List<String> res = new ArrayList();
        
        for (String cpd : cpdomains) {
            int idxSpace = cpd.indexOf(" ");
            int count = Integer.valueOf(cpd.substring(0, idxSpace));
            String domainString = cpd.substring(idxSpace + 1);
            
            do {
                if (!map.containsKey(domainString)) {
                    map.put(domainString, count);
                } else {
                    map.put(domainString, map.get(domainString) + count);
                }
                int nextIdx = domainString.indexOf('.');
                if (nextIdx != -1)
                    domainString = domainString.substring(nextIdx + 1);
                else
                    domainString = null;
            } while (domainString != null);
            
        }
        
        for (String domain : map.keySet()) {
            String resString =  "" + map.get(domain) + " " + domain;
            res.add(resString);
        }
        
        return res;
    }
}
