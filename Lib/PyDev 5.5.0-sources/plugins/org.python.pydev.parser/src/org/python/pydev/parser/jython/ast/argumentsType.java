// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class argumentsType extends SimpleNode {
    public exprType[] args;
    public NameTokType vararg;
    public NameTokType kwarg;
    public exprType[] defaults;
    public exprType[] kwonlyargs;
    public exprType[] kw_defaults;
    public exprType[] annotation;
    public exprType varargannotation;
    public exprType kwargannotation;
    public exprType[] kwonlyargannotation;

    public argumentsType(exprType[] args, NameTokType vararg, NameTokType kwarg, exprType[]
    defaults, exprType[] kwonlyargs, exprType[] kw_defaults, exprType[] annotation, exprType
    varargannotation, exprType kwargannotation, exprType[] kwonlyargannotation) {
        this.args = args;
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = defaults;
        this.kwonlyargs = kwonlyargs;
        this.kw_defaults = kw_defaults;
        this.annotation = annotation;
        this.varargannotation = varargannotation;
        this.kwargannotation = kwargannotation;
        this.kwonlyargannotation = kwonlyargannotation;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(args);
        result = prime * result + ((vararg == null) ? 0 : vararg.hashCode());
        result = prime * result + ((kwarg == null) ? 0 : kwarg.hashCode());
        result = prime * result + Arrays.hashCode(defaults);
        result = prime * result + Arrays.hashCode(kwonlyargs);
        result = prime * result + Arrays.hashCode(kw_defaults);
        result = prime * result + Arrays.hashCode(annotation);
        result = prime * result + ((varargannotation == null) ? 0 : varargannotation.hashCode());
        result = prime * result + ((kwargannotation == null) ? 0 : kwargannotation.hashCode());
        result = prime * result + Arrays.hashCode(kwonlyargannotation);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        argumentsType other = (argumentsType) obj;
        if (!Arrays.equals(args, other.args)) return false;
        if (vararg == null) { if (other.vararg != null) return false;}
        else if (!vararg.equals(other.vararg)) return false;
        if (kwarg == null) { if (other.kwarg != null) return false;}
        else if (!kwarg.equals(other.kwarg)) return false;
        if (!Arrays.equals(defaults, other.defaults)) return false;
        if (!Arrays.equals(kwonlyargs, other.kwonlyargs)) return false;
        if (!Arrays.equals(kw_defaults, other.kw_defaults)) return false;
        if (!Arrays.equals(annotation, other.annotation)) return false;
        if (varargannotation == null) { if (other.varargannotation != null) return false;}
        else if (!varargannotation.equals(other.varargannotation)) return false;
        if (kwargannotation == null) { if (other.kwargannotation != null) return false;}
        else if (!kwargannotation.equals(other.kwargannotation)) return false;
        if (!Arrays.equals(kwonlyargannotation, other.kwonlyargannotation)) return false;
        return true;
    }
    @Override
    public argumentsType createCopy() {
        return createCopy(true);
    }
    @Override
    public argumentsType createCopy(boolean copyComments) {
        exprType[] new0;
        if(this.args != null){
        new0 = new exprType[this.args.length];
        for(int i=0;i<this.args.length;i++){
            new0[i] = (exprType) (this.args[i] != null? this.args[i].createCopy(copyComments):null);
        }
        }else{
            new0 = this.args;
        }
        exprType[] new1;
        if(this.defaults != null){
        new1 = new exprType[this.defaults.length];
        for(int i=0;i<this.defaults.length;i++){
            new1[i] = (exprType) (this.defaults[i] != null?
            this.defaults[i].createCopy(copyComments):null);
        }
        }else{
            new1 = this.defaults;
        }
        exprType[] new2;
        if(this.kwonlyargs != null){
        new2 = new exprType[this.kwonlyargs.length];
        for(int i=0;i<this.kwonlyargs.length;i++){
            new2[i] = (exprType) (this.kwonlyargs[i] != null?
            this.kwonlyargs[i].createCopy(copyComments):null);
        }
        }else{
            new2 = this.kwonlyargs;
        }
        exprType[] new3;
        if(this.kw_defaults != null){
        new3 = new exprType[this.kw_defaults.length];
        for(int i=0;i<this.kw_defaults.length;i++){
            new3[i] = (exprType) (this.kw_defaults[i] != null?
            this.kw_defaults[i].createCopy(copyComments):null);
        }
        }else{
            new3 = this.kw_defaults;
        }
        exprType[] new4;
        if(this.annotation != null){
        new4 = new exprType[this.annotation.length];
        for(int i=0;i<this.annotation.length;i++){
            new4[i] = (exprType) (this.annotation[i] != null?
            this.annotation[i].createCopy(copyComments):null);
        }
        }else{
            new4 = this.annotation;
        }
        exprType[] new5;
        if(this.kwonlyargannotation != null){
        new5 = new exprType[this.kwonlyargannotation.length];
        for(int i=0;i<this.kwonlyargannotation.length;i++){
            new5[i] = (exprType) (this.kwonlyargannotation[i] != null?
            this.kwonlyargannotation[i].createCopy(copyComments):null);
        }
        }else{
            new5 = this.kwonlyargannotation;
        }
        argumentsType temp = new argumentsType(new0,
        vararg!=null?(NameTokType)vararg.createCopy(copyComments):null,
        kwarg!=null?(NameTokType)kwarg.createCopy(copyComments):null, new1, new2, new3, new4,
        varargannotation!=null?(exprType)varargannotation.createCopy(copyComments):null,
        kwargannotation!=null?(exprType)kwargannotation.createCopy(copyComments):null, new5);
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
        StringBuffer sb = new StringBuffer("arguments[");
        sb.append("args=");
        sb.append(dumpThis(this.args));
        sb.append(", ");
        sb.append("vararg=");
        sb.append(dumpThis(this.vararg));
        sb.append(", ");
        sb.append("kwarg=");
        sb.append(dumpThis(this.kwarg));
        sb.append(", ");
        sb.append("defaults=");
        sb.append(dumpThis(this.defaults));
        sb.append(", ");
        sb.append("kwonlyargs=");
        sb.append(dumpThis(this.kwonlyargs));
        sb.append(", ");
        sb.append("kw_defaults=");
        sb.append(dumpThis(this.kw_defaults));
        sb.append(", ");
        sb.append("annotation=");
        sb.append(dumpThis(this.annotation));
        sb.append(", ");
        sb.append("varargannotation=");
        sb.append(dumpThis(this.varargannotation));
        sb.append(", ");
        sb.append("kwargannotation=");
        sb.append(dumpThis(this.kwargannotation));
        sb.append(", ");
        sb.append("kwonlyargannotation=");
        sb.append(dumpThis(this.kwonlyargannotation));
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object accept(VisitorIF visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    @Override
    public void traverse(VisitorIF visitor) throws Exception {
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                if (args[i] != null) {
                    args[i].accept(visitor);
                }
            }
        }
        if (vararg != null) {
            vararg.accept(visitor);
        }
        if (kwarg != null) {
            kwarg.accept(visitor);
        }
        if (defaults != null) {
            for (int i = 0; i < defaults.length; i++) {
                if (defaults[i] != null) {
                    defaults[i].accept(visitor);
                }
            }
        }
        if (kwonlyargs != null) {
            for (int i = 0; i < kwonlyargs.length; i++) {
                if (kwonlyargs[i] != null) {
                    kwonlyargs[i].accept(visitor);
                }
            }
        }
        if (kw_defaults != null) {
            for (int i = 0; i < kw_defaults.length; i++) {
                if (kw_defaults[i] != null) {
                    kw_defaults[i].accept(visitor);
                }
            }
        }
        if (annotation != null) {
            for (int i = 0; i < annotation.length; i++) {
                if (annotation[i] != null) {
                    annotation[i].accept(visitor);
                }
            }
        }
        if (varargannotation != null) {
            varargannotation.accept(visitor);
        }
        if (kwargannotation != null) {
            kwargannotation.accept(visitor);
        }
        if (kwonlyargannotation != null) {
            for (int i = 0; i < kwonlyargannotation.length; i++) {
                if (kwonlyargannotation[i] != null) {
                    kwonlyargannotation[i].accept(visitor);
                }
            }
        }
    }

}
