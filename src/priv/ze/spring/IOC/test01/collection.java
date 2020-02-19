package priv.ze.spring.IOC.test01;

import java.util.*;

/**
 * ClassName:collection
 * Package:priv.ze.spring.IOC.test01
 *
 * @date:2019/11/23 20:14
 */
public class collection {
   private String [] strings;
   private School[] schools;
   private List<String> Mylist;
   private Set<String> Myset;
   private Map<String,Object> Mymap;
   private Properties properties;

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public School[] getSchools() {
        return schools;
    }

    public void setSchools(School[] schools) {
        this.schools = schools;
    }

    public List<String> getMylist() {
        return Mylist;
    }

    public void setMylist(List<String> mylist) {
        Mylist = mylist;
    }

    public Set<String> getMyset() {
        return Myset;
    }

    public void setMyset(Set<String> myset) {
        Myset = myset;
    }

    public Map<String, Object> getMymap() {
        return Mymap;
    }

    public void setMymap(Map<String, Object> mymap) {
        Mymap = mymap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "collection{" +
                "strings=" + Arrays.toString(strings) +
                ", schools=" + Arrays.toString(schools) +
                ", Mylist=" + Mylist +
                ", Myset=" + Myset +
                ", Mymap=" + Mymap +
                ", properties=" + properties +
                '}';
    }
}
