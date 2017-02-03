// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class Assign extends stmtType {
    public exprType[] targets;
    public exprType value;
    public exprType type;

    public Assign(exprType[] targets, exprType value, exprType type) {
        this.targets = targets;
        this.value = value;
        this.type = type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(targets);
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Assign other = (Assign) obj;
        if (!Arrays.equals(targets, other.targets)) return false;
        if (value == null) { if (other.value != null) return false;}
        else if (!value.equals(other.value)) return false;
        if (type == null) { if (other.type != null) return false;}
        else if (!type.equals(other.type)) return false;
        return true;
    }
    @Override
    public Assign createCopy() {
        return createCopy(true);
    }
    @Override
    public Assign createCopy(boolean copyComments) {
        exprType[] new0;
        if(this.targets != null){
        new0 = new exprType[this.targets.length];
        for(int i=0;i<this.targets.length;i++){
            new0[i] = (exprType) (this.targets[i] != null?
            this.targets[i].createCopy(copyComments):null);
        }
        }else{
            new0 = this.targets;
        }
        Assign temp = new Assign(new0, value!=null?(exprType)value.createCopy(copyComments):null,
        type!=null?(exprType)type.createCopy(copyComments):null);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if(this.specialsBefore != null && copyComments){
            for(Object o:this.specialsBefore){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy(copyComments));
                }
            }
        }
        if(this.specialsAfter != null && copyComments){
            for(Object o:this.specialsAfter){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy(copyComments));
                }
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Assign[");
        sb.append("targets=");
        sb.append(dumpThis(this.targets));
        sb.append(", ");
        sb.append("value=");
        sb.append(dumpThis(this.value));
        sb.append(", ");
        sb.append("type=");
        sb.append(dumpThis(this.type));
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitAssign(this);
    }

    @Override
    public void traverse(VisitorIF visitor) throws Exception {
        if (targets != null) {
            for (int i = 0; i < targets.length; i++) {
                if (targets[i] != null) {
                    targets[i].accept(visitor);
                }
            }
        }
        if (value != null) {
            value.accept(visitor);
        }
        if (type != null) {
            type.accept(visitor);
        }
    }

}