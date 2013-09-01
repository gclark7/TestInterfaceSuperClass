/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testinterfacesuperclass;

/**
 *
 * @author gcDataTechnology
 */
//I wrote in my lecture notes that an interface can extend a class...Not according to this
//public interface SuperParentable extends SuperParent{//expected interface here
public interface SuperParentable {
    
    public abstract int getSize();
    public abstract void setSize(int s);
}
