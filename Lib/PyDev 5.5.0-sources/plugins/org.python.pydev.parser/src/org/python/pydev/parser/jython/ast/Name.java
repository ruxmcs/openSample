// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class Name extends exprType implements expr_contextType {
    public String id;
    public int ctx;
    public boolean reserved;

    public Name(String id, int ctx, boolean reserved) {
        this.id = id;
        this.ctx = ctx;
        this.reserved = reserved;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ctx;
        result = prime * result + (reserved ? 17 : 137);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Name other = (Name) obj;
        if (id == null) { if (other.id != null) return false;}
        else if (!id.equals(other.id)) return false;
        if(this.ctx != other.ctx) return false;
        if(this.reserved != other.reserved) return false;
        return true;
    }
    @Override
    public Name createCopy() {
        return createCopy(true);
    }
    @Override
    public Name createCopy(boolean copyComments) {
        Name temp = new Name(id, ctx, reserved);
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
        StringBuffer sb = new StringBuffer("Name[");
        sb.append("id=");
        sb.append(dumpThis(this.id));
        sb.append(", ");
        sb.append("ctx=");
        sb.append(dumpThis(this.ctx, expr_contextType.expr_contextTypeNames));
        sb.append(", ");
        sb.append("reserved=");
        sb.append(dumpThis(this.reserved));
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitName(this);
    }

    @Override
    public void traverse(VisitorIF visitor) throws Exception {
    }

}