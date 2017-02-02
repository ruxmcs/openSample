// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class Call extends exprType {
    public exprType func;
    public exprType[] args;
    public keywordType[] keywords;
    public exprType starargs;
    public exprType kwargs;

    public Call(exprType func, exprType[] args, keywordType[] keywords, exprType starargs, exprType
    kwargs) {
        this.func = func;
        this.args = args;
        this.keywords = keywords;
        this.starargs = starargs;
        this.kwargs = kwargs;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((func == null) ? 0 : func.hashCode());
        result = prime * result + Arrays.hashCode(args);
        result = prime * result + Arrays.hashCode(keywords);
        result = prime * result + ((starargs == null) ? 0 : starargs.hashCode());
        result = prime * result + ((kwargs == null) ? 0 : kwargs.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Call other = (Call) obj;
        if (func == null) { if (other.func != null) return false;}
        else if (!func.equals(other.func)) return false;
        if (!Arrays.equals(args, other.args)) return false;
        if (!Arrays.equals(keywords, other.keywords)) return false;
        if (starargs == null) { if (other.starargs != null) return false;}
        else if (!starargs.equals(other.starargs)) return false;
        if (kwargs == null) { if (other.kwargs != null) return false;}
        else if (!kwargs.equals(other.kwargs)) return false;
        return true;
    }
    @Override
    public Call createCopy() {
        return createCopy(true);
    }
    @Override
    public Call createCopy(boolean copyComments) {
        exprType[] new0;
        if(this.args != null){
        new0 = new exprType[this.args.length];
        for(int i=0;i<this.args.length;i++){
            new0[i] = (exprType) (this.args[i] != null? this.args[i].createCopy(copyComments):null);
        }
        }else{
            new0 = this.args;
        }
        keywordType[] new1;
        if(this.keywords != null){
        new1 = new keywordType[this.keywords.length];
        for(int i=0;i<this.keywords.length;i++){
            new1[i] = (keywordType) (this.keywords[i] != null?
            this.keywords[i].createCopy(copyComments):null);
        }
        }else{
            new1 = this.keywords;
        }
        Call temp = new Call(func!=null?(exprType)func.createCopy(copyComments):null, new0, new1,
        starargs!=null?(exprType)starargs.createCopy(copyComments):null,
        kwargs!=null?(exprType)kwargs.createCopy(copyComments):null);
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
        StringBuffer sb = new StringBuffer("Call[");
        sb.append("func=");
        sb.append(dumpThis(this.func));
        sb.append(", ");
        sb.append("args=");
        sb.append(dumpThis(this.args));
        sb.append(", ");
        sb.append("keywords=");
        sb.append(dumpThis(this.keywords));
        sb.append(", ");
        sb.append("starargs=");
        sb.append(dumpThis(this.starargs));
        sb.append(", ");
        sb.append("kwargs=");
        sb.append(dumpThis(this.kwargs));
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitCall(this);
    }

    @Override
    public void traverse(VisitorIF visitor) throws Exception {
        if (func != null) {
            func.accept(visitor);
        }
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                if (args[i] != null) {
                    args[i].accept(visitor);
                }
            }
        }
        if (keywords != null) {
            for (int i = 0; i < keywords.length; i++) {
                if (keywords[i] != null) {
                    keywords[i].accept(visitor);
                }
            }
        }
        if (starargs != null) {
            starargs.accept(visitor);
        }
        if (kwargs != null) {
            kwargs.accept(visitor);
        }
    }

}
