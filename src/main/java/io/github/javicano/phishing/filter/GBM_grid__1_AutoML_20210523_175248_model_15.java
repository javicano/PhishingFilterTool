package io.github.javicano.phishing.filter;

import hex.genmodel.GenModel;
import hex.genmodel.annotations.ModelPojo;

@ModelPojo(name="GBM_grid__1_AutoML_20210523_175248_model_15", algorithm="gbm")
public class GBM_grid__1_AutoML_20210523_175248_model_15 extends GenModel {

private static final long serialVersionUID = 15L;

public hex.ModelCategory getModelCategory() { return hex.ModelCategory.Binomial; }

  public boolean isSupervised() { return true; }
  public int nfeatures() { return 16; }
  public int nclasses() { return 2; }

  // Names of columns used by model.
  public static final String[] NAMES = NamesHolder_GBM_grid__1_AutoML_20210523_175248_model_15.VALUES;
  // Number of output classes included in training data response column.
  public static final int NCLASSES = 2;

  // Column domains. The last array contains domain of response column.
  public static final String[][] DOMAINS = new String[][] {
    /* htmlBody */ GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_0.VALUES,
    /* scriptTag */ GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_1.VALUES,
    /* hexadecimalURLs */ null,
    /* domainsCount */ null,
    /* dotsCount */ null,
    /* isAccountTerm */ GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_5.VALUES,
    /* isDearTeam */ GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_6.VALUES,
    /* imagesAsURL */ null,
    /* isPayPalTerm */ GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_8.VALUES,
    /* isLoginTerm */ GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_9.VALUES,
    /* isBankTerm */ GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_10.VALUES,
    /* isVerifyTerm */ GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_11.VALUES,
    /* isAgreeTerm */ GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_12.VALUES,
    /* isSuspendTerm */ GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_13.VALUES,
    /* phishingTermsWeight */ null,
    /* domainSender */ GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_15.VALUES,
    /* isPhishing */ GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_16.VALUES
  };
  // Prior class distribution
  public static final double[] PRIOR_CLASS_DISTRIB = {0.7145877378435518,0.2854122621564482};
  // Class distribution used for model building
  public static final double[] MODEL_CLASS_DISTRIB = {0.7145877378435518,0.2854122621564482};

  public GBM_grid__1_AutoML_20210523_175248_model_15() { super(NAMES,DOMAINS,"isPhishing"); }
  public String getUUID() { return Long.toString(4699320452703188536L); }

  // Pass in data in a double[], pre-aligned to the Model's requirements.
  // Jam predictions into the preds[] array; preds[0] is reserved for the
  // main prediction (class for classifiers or value for regression),
  // and remaining columns hold a probability distribution for classifiers.
  public final double[] score0( double[] data, double[] preds ) {
    java.util.Arrays.fill(preds,0);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_0.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_1.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_2.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_3.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_4.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_5.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_6.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_7.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_8.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_9.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_10.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_11.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_12.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_13.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_14.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_15.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_16.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_17.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_18.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_19.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_20.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_21.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_22.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_23.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_24.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_25.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_26.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_27.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_28.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_29.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_30.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_31.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_32.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_33.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_34.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_35.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_36.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_37.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_38.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_39.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_40.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_41.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_42.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_43.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_44.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_45.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_46.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_47.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_48.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_49.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_50.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_51.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_52.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_53.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_54.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_55.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_56.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_57.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_58.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_59.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_60.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_61.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_62.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_63.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_64.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_65.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_66.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_67.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_68.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_69.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_70.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_71.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_72.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_73.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_74.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_75.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_76.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_77.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_78.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_79.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_80.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_81.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_82.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_83.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_84.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_85.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_86.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_87.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_88.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_89.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_90.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_91.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_92.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_93.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_94.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_95.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_96.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_97.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_98.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_99.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_100.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_101.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_102.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_103.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_104.score0(data,preds);
    GBM_grid__1_AutoML_20210523_175248_model_15_Forest_105.score0(data,preds);
    preds[2] = preds[1] + -0.9177711170445892;
    preds[2] = 1./(1. + Math.min(1e19, Math.exp(-(preds[2]))));
    preds[1] = 1.0-preds[2];
    preds[0] = hex.genmodel.GenModel.getPrediction(preds, PRIOR_CLASS_DISTRIB, data, 0.2699691996350918);
    return preds;
  }
}
@SuppressWarnings("serial")
// The class representing training column names
class NamesHolder_GBM_grid__1_AutoML_20210523_175248_model_15 implements java.io.Serializable {
  public static final String[] VALUES = new String[16];
  static {
    NamesHolder_GBM_grid__1_AutoML_20210523_175248_model_15_0.fill(VALUES);
  }
  static final class NamesHolder_GBM_grid__1_AutoML_20210523_175248_model_15_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "htmlBody";
      sa[1] = "scriptTag";
      sa[2] = "hexadecimalURLs";
      sa[3] = "domainsCount";
      sa[4] = "dotsCount";
      sa[5] = "isAccountTerm";
      sa[6] = "isDearTeam";
      sa[7] = "imagesAsURL";
      sa[8] = "isPayPalTerm";
      sa[9] = "isLoginTerm";
      sa[10] = "isBankTerm";
      sa[11] = "isVerifyTerm";
      sa[12] = "isAgreeTerm";
      sa[13] = "isSuspendTerm";
      sa[14] = "phishingTermsWeight";
      sa[15] = "domainSender";
    }
  }
}
@SuppressWarnings("serial")
// The class representing column htmlBody
class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_0 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_0_0.fill(VALUES);
  }
  static final class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_0_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "False";
      sa[1] = "True";
    }
  }
}
@SuppressWarnings("serial")
// The class representing column scriptTag
class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_1 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_1_0.fill(VALUES);
  }
  static final class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_1_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "False";
      sa[1] = "True";
    }
  }
}
@SuppressWarnings("serial")
// The class representing column isAccountTerm
class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_5 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_5_0.fill(VALUES);
  }
  static final class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_5_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "False";
      sa[1] = "True";
    }
  }
}
@SuppressWarnings("serial")
// The class representing column isDearTeam
class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_6 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_6_0.fill(VALUES);
  }
  static final class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_6_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "False";
      sa[1] = "True";
    }
  }
}
@SuppressWarnings("serial")
// The class representing column isPayPalTerm
class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_8 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_8_0.fill(VALUES);
  }
  static final class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_8_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "False";
      sa[1] = "True";
    }
  }
}
@SuppressWarnings("serial")
// The class representing column isLoginTerm
class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_9 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_9_0.fill(VALUES);
  }
  static final class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_9_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "False";
      sa[1] = "True";
    }
  }
}
@SuppressWarnings("serial")
// The class representing column isBankTerm
class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_10 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_10_0.fill(VALUES);
  }
  static final class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_10_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "False";
      sa[1] = "True";
    }
  }
}
@SuppressWarnings("serial")
// The class representing column isVerifyTerm
class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_11 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_11_0.fill(VALUES);
  }
  static final class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_11_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "False";
      sa[1] = "True";
    }
  }
}
@SuppressWarnings("serial")
// The class representing column isAgreeTerm
class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_12 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_12_0.fill(VALUES);
  }
  static final class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_12_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "False";
      sa[1] = "True";
    }
  }
}
@SuppressWarnings("serial")
// The class representing column isSuspendTerm
class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_13 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_13_0.fill(VALUES);
  }
  static final class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_13_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "False";
      sa[1] = "True";
    }
  }
}
@SuppressWarnings("serial")
// The class representing column domainSender
class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_15 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_15_0.fill(VALUES);
  }
  static final class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_15_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "False";
      sa[1] = "True";
    }
  }
}
@SuppressWarnings("serial")
// The class representing column isPhishing
class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_16 implements java.io.Serializable {
  public static final String[] VALUES = new String[2];
  static {
    GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_16_0.fill(VALUES);
  }
  static final class GBM_grid__1_AutoML_20210523_175248_model_15_ColInfo_16_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "False";
      sa[1] = "True";
    }
  }
}

class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_0 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_0_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_0_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[9])) ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                     (data[3 /* domainsCount */] <0.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0781683f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8355804f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.29245314f ? 
                                    -0.08506845f : 
                                    0.03835416f) : 
                                -0.13994083f) : 
                            0.05618366f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.284626f ? 
                                    -0.11196664f : 
                                    -0.1287974f) : 
                                0.05618366f) : 
                             (data[14 /* phishingTermsWeight */] <0.0734072f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    -0.09249135f : 
                                    -0.12032838f) : 
                                 (data[14 /* phishingTermsWeight */] <0.84051245f ? 
                                    0.08478514f : 
                                    -0.09780471f)))) : 
                     (data[14 /* phishingTermsWeight */] <0.17204812f ? 
                        -0.07865193f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.95166624f ? 
                            0.13245429f : 
                            0.043925878f))) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                    0.023496244f : 
                    0.25230813f)) : 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0291748f ? 
                0.043925878f : 
                0.26865184f)) : 
         (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[5])) ? 
             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                 (data[14 /* phishingTermsWeight */] <2.2906451f ? 
                    -0.050793335f : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5535305f ? 
                         (data[3 /* domainsCount */] <6.5f ? 
                            -0.06989637f : 
                            -0.13994083f) : 
                        -0.041878585f)) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.474777f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <37.5f ? 
                         (data[3 /* domainsCount */] <1.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.3232687f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.2058034f ? 
                                    0.09858895f : 
                                    -0.13994083f) : 
                                0.25230813f) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                 (data[14 /* phishingTermsWeight */] <1.9469529f ? 
                                    0.105214775f : 
                                    0.19510517f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.2630193f ? 
                                    0.140237f : 
                                    -0.13994083f))) : 
                        -0.13994083f) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <37.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                                0.023496244f : 
                                 (data[3 /* domainsCount */] <1.5f ? 
                                    0.3083437f : 
                                    0.2255639f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <11.5f ? 
                                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[10])) ? 
                                    -0.017363025f : 
                                    0.25230813f) : 
                                 (data[3 /* domainsCount */] <18.0f ? 
                                    -0.06989637f : 
                                    -0.13994083f))) : 
                        -0.090909705f))) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <18.5f ? 
                 (data[14 /* phishingTermsWeight */] <2.1015842f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8481834f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                            0.22325267f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                0.082927905f : 
                                0.05618366f)) : 
                         (data[3 /* domainsCount */] <1.5f ? 
                            0.35037038f : 
                            0.105214775f)) : 
                     (data[3 /* domainsCount */] <0.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.5273976f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.6786811f ? 
                                0.24141234f : 
                                0.05618366f) : 
                            0.35037038f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <16.0f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.8736844f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.690942f ? 
                                    0.32774064f : 
                                    0.2749379f) : 
                                0.35037038f) : 
                            0.18693331f))) : 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[10])) ? 
                    -0.13994083f : 
                     (data[14 /* phishingTermsWeight */] <5.30947f ? 
                        0.1542459f : 
                        0.35037038f)))));
    return pred;
  } // constant pool size = 245B, number of visited nodes = 52, static init size = 210B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_1 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_1_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_1_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                             (data[3 /* domainsCount */] <0.5f ? 
                                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                                    -0.07111341f : 
                                    0.017587457f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                    -0.086276755f : 
                                    -0.10271052f)) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                                    -0.0676806f : 
                                    0.019738745f) : 
                                0.054135438f)) : 
                        0.24001713f) : 
                    0.10930118f) : 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                        -0.089016415f : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                -0.041772235f : 
                                -0.044103477f) : 
                            -0.056124672f)) : 
                    0.29529274f)) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <23.5f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                    0.07373093f : 
                                    0.16784285f) : 
                                 (data[3 /* domainsCount */] <5.5f ? 
                                    -0.03811459f : 
                                    0.0523552f)) : 
                            0.24471243f) : 
                        0.26206997f) : 
                     (data[7 /* imagesAsURL */] <18.5f ? 
                        -0.014048196f : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <11.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                 (data[7 /* imagesAsURL */] <96.5f ? 
                                    -0.13876706f : 
                                    -0.13682908f) : 
                                 (data[3 /* domainsCount */] <9.5f ? 
                                    -0.14171599f : 
                                    -0.13768362f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <12.5f ? 
                                    -0.13546188f : 
                                    -0.13647567f) : 
                                -0.13509516f)))) : 
                 (data[7 /* imagesAsURL */] <8.0f ? 
                    -0.07062343f : 
                     (data[7 /* imagesAsURL */] <10.5f ? 
                        -0.13612743f : 
                        -0.13531569f)))) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <10.0f ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                     (data[3 /* domainsCount */] <0.5f ? 
                        0.18895006f : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <14.0f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    0.25868893f : 
                                    0.24131939f) : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                    0.26763412f : 
                                    0.2248802f)) : 
                            0.18211244f)) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <27.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <14.5f ? 
                             (data[3 /* domainsCount */] <2.5f ? 
                                0.28370482f : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                    0.27986026f : 
                                    0.27717093f)) : 
                            0.28939673f) : 
                        0.21925052f)) : 
                0.03763919f) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <17.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <24.5f ? 
                     (data[3 /* domainsCount */] <20.5f ? 
                        -0.059915658f : 
                        -0.13472494f) : 
                    -0.044334542f) : 
                0.09513247f)));
    return pred;
  } // constant pool size = 211B, number of visited nodes = 46, static init size = 150B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_2 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_2_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_2_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                    -0.058679555f : 
                    -0.097924344f) : 
                0.10732793f) : 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                -0.1516494f : 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                    -0.14222677f : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <8.5f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                -0.13153082f : 
                                -0.13122557f) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                                -0.13780951f : 
                                -0.14249338f)) : 
                        -0.13949077f)))) : 
         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (data[4 /* dotsCount */] <1.5f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                            0.031344168f : 
                            0.17303944f) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
                            0.25381446f : 
                            0.27347398f)) : 
                     (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[9])) ? 
                             (data[4 /* dotsCount */] <2.5f ? 
                                -0.072645426f : 
                                -0.092796914f) : 
                            0.030304682f) : 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[9])) ? 
                             (Double.isNaN(data[13 /* isSuspendTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[13]) || (GenModel.bitSetIsInRange(32, 0, data[13]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[13])) ? 
                                0.07312697f : 
                                0.2410219f) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                0.24789508f : 
                                0.18266068f)))) : 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[9])) ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                            -0.055528425f : 
                            9.432463E-4f) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <6.5f ? 
                            0.104646504f : 
                            0.07378283f)) : 
                    0.2260347f)) : 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[9])) ? 
                0.19131422f : 
                 (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                    0.21422154f : 
                    0.25012338f))));
    return pred;
  } // constant pool size = 184B, number of visited nodes = 28, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_3 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_3_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_3_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                -0.11229545f : 
                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[8])) ? 
                    0.025565572f : 
                    0.18219589f)) : 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                -0.13490826f : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                        0.20461546f : 
                        0.15603694f) : 
                    0.16948299f))) : 
         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[0])) ? 
            0.10935755f : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <38.0f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                     (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[8])) ? 
                        0.20194009f : 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[11])) ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                    0.22744009f : 
                                    0.2279395f) : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                                    0.2408484f : 
                                    0.21767522f)) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                0.2276613f : 
                                0.22136568f))) : 
                    0.11217149f) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <88.0f ? 
                    -0.1324828f : 
                    -0.13780645f))));
    return pred;
  } // constant pool size = 110B, number of visited nodes = 17, static init size = 240B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_4 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_4_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_4_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[8])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <37.5f ? 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[9])) ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                 (data[4 /* dotsCount */] <1.5f ? 
                                    -0.012478467f : 
                                    -0.0857074f) : 
                                 (data[4 /* dotsCount */] <1.5f ? 
                                    0.24251498f : 
                                    -0.029075352f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <27.0f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                    -0.0063452004f : 
                                    0.06548584f) : 
                                -0.13760057f)) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <19.0f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <10.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                                    0.13645755f : 
                                    0.0081439195f) : 
                                0.22252925f) : 
                            0.008555078f)) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <42.5f ? 
                        -0.13897845f : 
                        -0.13258207f)) : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                    0.1261506f : 
                    0.1426344f)) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (data[4 /* dotsCount */] <0.5f ? 
                    0.035908233f : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                             (data[4 /* dotsCount */] <1.5f ? 
                                0.16381845f : 
                                 (data[3 /* domainsCount */] <1.5f ? 
                                    0.0732334f : 
                                    0.17274353f)) : 
                            0.19028918f) : 
                        0.18086003f)) : 
                0.009850931f)) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (data[3 /* domainsCount */] <0.5f ? 
                    0.1715658f : 
                     (data[4 /* dotsCount */] <1.5f ? 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                            0.19197202f : 
                             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                                0.1898835f : 
                                0.20970984f)) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[11])) ? 
                                    0.18628503f : 
                                    0.20812047f) : 
                                 (data[3 /* domainsCount */] <4.5f ? 
                                    0.21643184f : 
                                    0.20206912f)) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (data[3 /* domainsCount */] <7.5f ? 
                                    0.15268748f : 
                                    0.2041072f) : 
                                0.12304f)))) : 
                 (data[3 /* domainsCount */] <1.5f ? 
                    0.08828621f : 
                    0.19459693f)) : 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[9])) ? 
                -0.0029846174f : 
                0.20042917f)));
    return pred;
  } // constant pool size = 196B, number of visited nodes = 36, static init size = 300B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_5 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_5_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_5_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
                    -0.090983726f : 
                    0.028871125f) : 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                    0.07227023f : 
                    0.17515214f)) : 
             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                -0.097751096f : 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                    -0.082344584f : 
                    -0.029769966f))) : 
         (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
            0.13172881f : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                         (data[4 /* dotsCount */] <0.5f ? 
                            0.05684249f : 
                             (data[4 /* dotsCount */] <1.5f ? 
                                0.18510574f : 
                                0.16984779f)) : 
                         (data[4 /* dotsCount */] <0.5f ? 
                             (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[8])) ? 
                                0.1840756f : 
                                0.22017212f) : 
                             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[8])) ? 
                                 (data[4 /* dotsCount */] <1.5f ? 
                                    0.17329629f : 
                                    0.17691506f) : 
                                 (data[4 /* dotsCount */] <1.5f ? 
                                    0.17451829f : 
                                    0.19193292f)))) : 
                     (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[8])) ? 
                        0.1221806f : 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[15])) ? 
                            0.13951929f : 
                            0.15110546f))) : 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[15])) ? 
                    0.041949484f : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                        0.13471594f : 
                        0.13546528f)))));
    return pred;
  } // constant pool size = 150B, number of visited nodes = 22, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_6 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_6_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_6_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[6])) ? 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                -0.11043592f : 
                -0.10091556f) : 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                -0.056265473f : 
                0.16539043f)) : 
         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <11.5f ? 
             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[6])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <37.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                             (data[3 /* domainsCount */] <0.5f ? 
                                -0.10436795f : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                    0.012993942f : 
                                    0.162722f)) : 
                             (data[3 /* domainsCount */] <0.5f ? 
                                0.07592195f : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                    0.033598546f : 
                                    0.1243286f))) : 
                         (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <22.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <19.0f ? 
                                    -0.025720866f : 
                                    -0.13638994f) : 
                                0.19864836f) : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                                    0.08727136f : 
                                    0.13208494f) : 
                                 (data[2 /* hexadecimalURLs */] <2.5f ? 
                                    0.21020922f : 
                                    0.25757155f)))) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <46.5f ? 
                         (data[3 /* domainsCount */] <40.5f ? 
                            -0.13219544f : 
                            -0.13884814f) : 
                        -0.061373718f)) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <18.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <10.5f ? 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[15])) ? 
                             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                                0.08812991f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    0.165767f : 
                                    0.14609039f)) : 
                             (data[3 /* domainsCount */] <1.5f ? 
                                 (data[3 /* domainsCount */] <0.5f ? 
                                    0.14974369f : 
                                    0.17188068f) : 
                                 (data[3 /* domainsCount */] <2.5f ? 
                                    0.20977232f : 
                                    0.19030406f))) : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.0f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                                -0.124633186f : 
                                0.029236523f) : 
                            0.18201795f)) : 
                    0.055637844f)) : 
            -0.13438167f));
    return pred;
  } // constant pool size = 176B, number of visited nodes = 31, static init size = 300B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_7 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_7_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_7_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[10])) ? 
         (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[8])) ? 
             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[12])) ? 
                    -0.12618527f : 
                    -0.09729823f) : 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[12])) ? 
                    -0.02812089f : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <6.0f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                    0.056906324f : 
                                    0.16520903f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <9.5f ? 
                                    -0.14979942f : 
                                    -0.13399549f)) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                0.16112746f : 
                                0.14668255f)) : 
                         (data[7 /* imagesAsURL */] <33.5f ? 
                             (data[7 /* imagesAsURL */] <14.5f ? 
                                -0.013181243f : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <19.0f ? 
                                    -0.13974571f : 
                                    -0.04324329f)) : 
                             (data[7 /* imagesAsURL */] <53.0f ? 
                                -0.13930735f : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <112.5f ? 
                                    -0.13040309f : 
                                    -0.13628569f)))))) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <18.0f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
                        0.15985359f : 
                        0.16224526f) : 
                    0.17381117f) : 
                0.0073437677f)) : 
         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[0])) ? 
            -0.031151775f : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <16.0f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[9])) ? 
                             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[12])) ? 
                                0.14204863f : 
                                0.1534798f) : 
                            0.1629748f) : 
                         (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[12])) ? 
                             (data[7 /* imagesAsURL */] <1.5f ? 
                                0.15578707f : 
                                0.14772217f) : 
                            0.17182095f)) : 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[9])) ? 
                        0.018062923f : 
                        0.17613341f)) : 
                -0.061831787f)));
    return pred;
  } // constant pool size = 174B, number of visited nodes = 28, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_8 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_8_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_8_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[5])) ? 
             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[8])) ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <16.0f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                -0.06304016f : 
                                -0.039687507f) : 
                            -0.05296465f) : 
                         (data[7 /* imagesAsURL */] <4.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                0.07401668f : 
                                0.1843958f) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                    -0.14212874f : 
                                    -0.12880003f) : 
                                -0.0015245304f))) : 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                         (data[7 /* imagesAsURL */] <57.5f ? 
                            -0.13535109f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <116.5f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <111.5f ? 
                                    -0.12917577f : 
                                    -0.13454843f) : 
                                 (data[7 /* imagesAsURL */] <131.0f ? 
                                    -0.12799579f : 
                                    -0.1257942f))) : 
                        -0.12353262f)) : 
                0.06776532f) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                    0.13268156f : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                             (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[8])) ? 
                                0.12895016f : 
                                0.15263526f) : 
                             (data[7 /* imagesAsURL */] <1.5f ? 
                                0.1715613f : 
                                0.17085911f)) : 
                        0.11365037f)) : 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[15])) ? 
                    -0.14930718f : 
                    0.0076483386f))) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <37.0f ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[15])) ? 
                     (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[5])) ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                            0.09265148f : 
                            0.17190608f) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[8])) ? 
                                0.15010686f : 
                                0.15226105f) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                    0.15024595f : 
                                    0.14893293f) : 
                                0.1522626f))) : 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[5])) ? 
                        0.14661348f : 
                        0.17973483f)) : 
                0.065815f) : 
             (data[7 /* imagesAsURL */] <76.0f ? 
                -0.12264768f : 
                 (data[7 /* imagesAsURL */] <95.0f ? 
                    -0.12648086f : 
                    -0.1367128f))));
    return pred;
  } // constant pool size = 207B, number of visited nodes = 35, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_9 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_9_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_9_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <6.0f ? 
             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                            -0.09895716f : 
                            -0.12270083f) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                            -0.118509434f : 
                            -0.12451326f)) : 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <5.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                0.009106285f : 
                                 (data[7 /* imagesAsURL */] <1.5f ? 
                                    0.170507f : 
                                    0.13428582f)) : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                0.16070008f : 
                                 (data[2 /* hexadecimalURLs */] <2.5f ? 
                                    0.22810005f : 
                                    0.2293192f))) : 
                        0.10022782f)) : 
                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                    -0.064260066f : 
                    0.11617224f)) : 
             (data[7 /* imagesAsURL */] <13.5f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <10.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <9.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.0f ? 
                            -0.14151585f : 
                            -0.132533f) : 
                        -0.12771717f) : 
                    -0.142062f) : 
                 (data[7 /* imagesAsURL */] <21.5f ? 
                    0.030769588f : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <112.5f ? 
                         (data[7 /* imagesAsURL */] <44.5f ? 
                            -0.13407025f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <91.5f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <83.5f ? 
                                    -0.12373894f : 
                                    -0.12959138f) : 
                                -0.11847046f)) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <130.0f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <117.5f ? 
                                -0.13215248f : 
                                -0.12808844f) : 
                            -0.122786745f))))) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <10.0f ? 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[10])) ? 
                    0.034929838f : 
                    0.06535576f) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[10])) ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <5.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                    0.13337158f : 
                                    0.14548561f) : 
                                0.14766762f) : 
                            0.16143984f) : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[8])) ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                    0.1474518f : 
                                    0.15305586f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                    0.15032221f : 
                                    0.1475629f)) : 
                             (data[2 /* hexadecimalURLs */] <1.5f ? 
                                0.06259101f : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                                    0.16283904f : 
                                    0.15069763f)))) : 
                    -0.0051820083f)) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <17.5f ? 
                -0.09192004f : 
                0.03749586f)));
    return pred;
  } // constant pool size = 202B, number of visited nodes = 40, static init size = 240B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_10 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_10_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_10_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[11])) ? 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[8])) ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <5.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                                    -0.021688282f : 
                                    -0.012809404f) : 
                                 (data[2 /* hexadecimalURLs */] <1.5f ? 
                                    0.0745086f : 
                                    0.14521092f)) : 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                                -0.013702149f : 
                                0.02976014f)) : 
                        0.13968135f) : 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <8.0f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <3.5f ? 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                    0.0773299f : 
                                    0.11640181f) : 
                                0.14704104f) : 
                            0.044290923f) : 
                        -0.12743902f)) : 
                0.119721465f) : 
             (data[7 /* imagesAsURL */] <33.0f ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                     (data[7 /* imagesAsURL */] <11.5f ? 
                        -0.1254846f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <17.5f ? 
                            -0.13954736f : 
                            -0.12809128f)) : 
                     (data[7 /* imagesAsURL */] <13.0f ? 
                        -0.061821945f : 
                        0.04920416f)) : 
                 (data[7 /* imagesAsURL */] <53.5f ? 
                     (data[7 /* imagesAsURL */] <48.5f ? 
                        -0.12927447f : 
                        -0.1419376f) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <113.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <92.0f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <84.5f ? 
                                 (data[7 /* imagesAsURL */] <67.0f ? 
                                    -0.124628514f : 
                                    -0.11927741f) : 
                                -0.12605509f) : 
                            -0.11706652f) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <130.5f ? 
                             (data[7 /* imagesAsURL */] <116.0f ? 
                                -0.13716169f : 
                                -0.12672877f) : 
                            -0.12016466f))))) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                        0.11471273f : 
                        0.122216746f) : 
                    0.15391688f) : 
                0.088843904f) : 
            0.13959254f));
    return pred;
  } // constant pool size = 161B, number of visited nodes = 31, static init size = 210B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_11 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_11_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_11_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[5])) ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (data[4 /* dotsCount */] <0.5f ? 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[12])) ? 
                        -0.1174504f : 
                        -0.031936023f) : 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[9])) ? 
                        -0.12511168f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (data[4 /* dotsCount */] <1.5f ? 
                                    -0.086981915f : 
                                    -0.11323699f) : 
                                -0.110151336f) : 
                            -0.11733102f))) : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <10.5f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                        -0.1186191f : 
                        -0.12401453f) : 
                    -0.11997441f)) : 
            0.034731317f) : 
         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[5])) ? 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[12])) ? 
                        -0.129064f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                             (data[4 /* dotsCount */] <1.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                                    -0.012128254f : 
                                    0.20640041f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                    0.006640121f : 
                                    -0.06571362f)) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.5f ? 
                                 (data[7 /* imagesAsURL */] <1.5f ? 
                                    0.15077011f : 
                                    0.12291309f) : 
                                -0.13009135f))) : 
                     (data[7 /* imagesAsURL */] <18.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <13.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <10.5f ? 
                                 (data[7 /* imagesAsURL */] <9.5f ? 
                                    -0.1323527f : 
                                    -0.12214709f) : 
                                -0.13313678f) : 
                            0.07380917f) : 
                         (data[7 /* imagesAsURL */] <39.5f ? 
                            -0.1266496f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <113.5f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <93.0f ? 
                                    -0.11939832f : 
                                    -0.11519103f) : 
                                 (data[4 /* dotsCount */] <2.5f ? 
                                    -0.11789028f : 
                                    -0.12413921f))))) : 
                0.13134073f) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <3.5f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <7.0f ? 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.13953033f : 
                                    0.110705875f) : 
                                0.14443843f) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                 (data[4 /* dotsCount */] <1.5f ? 
                                    0.1360912f : 
                                    0.14208329f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                    0.13421986f : 
                                    0.13676827f))) : 
                        -0.018494591f) : 
                    0.08187943f) : 
                 (data[7 /* imagesAsURL */] <15.5f ? 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[9])) ? 
                        -0.06830715f : 
                        0.11430159f) : 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[9])) ? 
                        -0.12732238f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <23.5f ? 
                            -0.030143335f : 
                            0.035463605f))))));
    return pred;
  } // constant pool size = 220B, number of visited nodes = 42, static init size = 300B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_12 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_12_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_12_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[12])) ? 
                    -0.088876635f : 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <5.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                                -0.06366764f : 
                                -0.034047227f) : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                    0.051024094f : 
                                    0.06889279f) : 
                                0.12957169f)) : 
                        0.044121966f)) : 
                 (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                    -0.022025455f : 
                    0.081872545f)) : 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[12])) ? 
                0.02950767f : 
                 (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[9])) ? 
                        0.05449575f : 
                        0.0940021f) : 
                    0.09817814f))) : 
         (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[10])) ? 
                0.034183856f : 
                 (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[12])) ? 
                    0.14158176f : 
                    0.1388101f)) : 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[12])) ? 
                0.039687984f : 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[10])) ? 
                    0.0994978f : 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[9])) ? 
                        0.12670995f : 
                        0.14477599f)))));
    return pred;
  } // constant pool size = 153B, number of visited nodes = 19, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_13 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_13_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_13_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[12])) ? 
                -0.122926764f : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                    -0.0012748765f : 
                    -0.070666015f)) : 
             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[11])) ? 
                -0.11945121f : 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[12])) ? 
                    -0.122653656f : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <8.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                -0.110984124f : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                    -0.109837554f : 
                                    -0.11888512f)) : 
                             (data[2 /* hexadecimalURLs */] <1.5f ? 
                                -0.13457888f : 
                                -0.123775005f)) : 
                        -0.11617154f)))) : 
         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <11.5f ? 
             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[11])) ? 
                     (data[4 /* dotsCount */] <1.5f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[12])) ? 
                                -0.07321598f : 
                                0.012837402f) : 
                            0.16518044f) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <6.5f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                    0.024217729f : 
                                    -0.01663032f) : 
                                0.07870087f) : 
                            -0.066159666f)) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                             (data[4 /* dotsCount */] <0.5f ? 
                                0.16702662f : 
                                 (data[4 /* dotsCount */] <1.5f ? 
                                    0.12866835f : 
                                    0.1253739f)) : 
                            0.14795531f) : 
                        0.040045995f)) : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                            0.14652866f : 
                            0.116284065f) : 
                         (data[2 /* hexadecimalURLs */] <3.5f ? 
                            0.18200985f : 
                            0.15798162f)) : 
                     (data[2 /* hexadecimalURLs */] <1.5f ? 
                        -0.0017780316f : 
                        0.08286428f))) : 
            -0.122316316f));
    return pred;
  } // constant pool size = 148B, number of visited nodes = 29, static init size = 180B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_14 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_14_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_14_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <16.0f ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[9])) ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                            -0.033878278f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <3.5f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                    -0.0044207256f : 
                                    0.06528733f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                                    -0.097986415f : 
                                    0.016771711f))) : 
                        0.07463233f) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.0f ? 
                            0.077833846f : 
                            0.0938608f) : 
                        0.059991624f)) : 
                 (data[7 /* imagesAsURL */] <53.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <30.0f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <16.5f ? 
                            -0.085152864f : 
                            -0.12951644f) : 
                        -0.13773802f) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <134.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <111.5f ? 
                             (data[7 /* imagesAsURL */] <77.0f ? 
                                -0.11937265f : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <87.5f ? 
                                    -0.116435766f : 
                                    -0.117766425f)) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <117.5f ? 
                                -0.12230013f : 
                                -0.1190544f)) : 
                        -0.11511553f))) : 
             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                0.07706312f : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                    0.12431564f : 
                    0.13001959f))) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <37.0f ? 
             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[10])) ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <5.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                            0.07023041f : 
                            0.12644053f) : 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[11])) ? 
                            0.12133997f : 
                            0.12619753f)) : 
                    0.14357044f) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <5.5f ? 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[11])) ? 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[9])) ? 
                            0.118395545f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                0.12970595f : 
                                0.13284825f)) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[9])) ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                    0.120785914f : 
                                    0.1330009f) : 
                                0.14504512f) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                0.08185268f : 
                                0.12685737f))) : 
                    -0.013799278f)) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <95.5f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <75.5f ? 
                    -0.11598015f : 
                    -0.11817503f) : 
                -0.13513586f)));
    return pred;
  } // constant pool size = 210B, number of visited nodes = 37, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_15 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_15_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_15_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.13557118f ? 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.065137714f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                         (data[3 /* domainsCount */] <0.5f ? 
                            -0.08032177f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                -0.08840796f : 
                                -0.08153051f)) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                            0.0016521597f : 
                            0.052569013f)) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                        -0.11350687f : 
                        -0.13741036f)) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.023830872f ? 
                    -0.06921738f : 
                    -0.03844468f)) : 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[9])) ? 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                    -0.06374404f : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.12459f ? 
                         (data[14 /* phishingTermsWeight */] <0.84959066f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                 (data[3 /* domainsCount */] <0.5f ? 
                                    -0.12091507f : 
                                    -0.009720403f) : 
                                0.17031966f) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.92742383f ? 
                                    -0.10929619f : 
                                    -0.08045903f) : 
                                0.026948957f)) : 
                         (data[14 /* phishingTermsWeight */] <1.2265826f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                 (data[3 /* domainsCount */] <0.5f ? 
                                    0.08314269f : 
                                    0.101269476f) : 
                                0.22659113f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3473634f ? 
                                 (data[14 /* phishingTermsWeight */] <1.3322395f ? 
                                    -0.0758666f : 
                                    0.055331815f) : 
                                -0.14729801f)))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0308936f ? 
                    -2.8362976E-5f : 
                    0.10247004f))) : 
         (data[14 /* phishingTermsWeight */] <1.6308396f ? 
             (data[14 /* phishingTermsWeight */] <1.5512828f ? 
                0.097581364f : 
                0.20493436f) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                     (data[14 /* phishingTermsWeight */] <1.9251645f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8261516f ? 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7574139f ? 
                                    -0.0034579777f : 
                                    0.16045934f) : 
                                 (data[3 /* domainsCount */] <0.5f ? 
                                    0.20262615f : 
                                    0.049280837f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                    -0.02740599f : 
                                    -0.0039817886f) : 
                                -0.049286895f)) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    0.113577336f : 
                                    0.053308137f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.2722993f ? 
                                    0.14788571f : 
                                    0.12179695f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.716036f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.448243f ? 
                                    0.1262488f : 
                                    0.17752942f) : 
                                 (data[3 /* domainsCount */] <0.5f ? 
                                    0.04101326f : 
                                    0.124293365f)))) : 
                     (data[14 /* phishingTermsWeight */] <2.21875f ? 
                         (data[14 /* phishingTermsWeight */] <1.7691972f ? 
                            0.06572286f : 
                             (data[3 /* domainsCount */] <6.5f ? 
                                0.20571148f : 
                                0.1556283f)) : 
                         (data[14 /* phishingTermsWeight */] <2.4776702f ? 
                            -0.08044199f : 
                             (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[5])) ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                    -0.04935539f : 
                                    0.09456843f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.583555f ? 
                                    0.13918933f : 
                                    0.06717328f))))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.0678463f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.3033733f ? 
                         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[5])) ? 
                             (data[14 /* phishingTermsWeight */] <2.30555f ? 
                                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[15])) ? 
                                    -0.113684975f : 
                                    0.08323854f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3685224f ? 
                                    -0.09015099f : 
                                    -0.014387279f)) : 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[9])) ? 
                                0.006778106f : 
                                0.1428581f)) : 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[9])) ? 
                             (data[3 /* domainsCount */] <24.5f ? 
                                -0.19163762f : 
                                -0.14392854f) : 
                            -0.1221418f)) : 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[9])) ? 
                        0.073647186f : 
                        0.13463885f)))));
    return pred;
  } // constant pool size = 298B, number of visited nodes = 59, static init size = 360B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_16 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_16_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_16_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.83966666f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.28207552f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.0440743f ? 
                             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
                                -0.027785514f : 
                                -0.010807798f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.1339238f ? 
                                -0.11440111f : 
                                -0.116468094f)) : 
                         (data[14 /* phishingTermsWeight */] <0.3868288f ? 
                            0.412136f : 
                             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                                 (data[14 /* phishingTermsWeight */] <0.6744974f ? 
                                    0.0151405325f : 
                                    0.013650663f) : 
                                0.16135207f))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0771298f ? 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                            -0.1266519f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.96919596f ? 
                                -0.11448421f : 
                                -0.11158279f)) : 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                            -0.046602536f : 
                            0.0729838f))) : 
                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.85132873f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.026604023f ? 
                            -0.11523113f : 
                            -0.11503822f) : 
                        0.041586876f) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.85132873f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.026604023f ? 
                            0.24498239f : 
                            0.21125394f) : 
                         (data[14 /* phishingTermsWeight */] <0.94904834f ? 
                            0.011531215f : 
                            0.20116775f)))) : 
             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[11])) ? 
                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[0])) ? 
                    -0.16078416f : 
                    -0.11680427f) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.15160649f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[0])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.041691784f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    -0.07482781f : 
                                    -0.07255728f) : 
                                -0.13154905f) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.064404435f ? 
                                    -0.108661145f : 
                                    -0.11016975f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                    -0.11179474f : 
                                    -0.111495964f))) : 
                        0.03254031f) : 
                     (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[0])) ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[10])) ? 
                            -0.11853532f : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    -0.10579353f : 
                                    -0.11391236f) : 
                                 (data[14 /* phishingTermsWeight */] <1.1483082f ? 
                                    -0.11417698f : 
                                    -0.11280911f))) : 
                         (data[14 /* phishingTermsWeight */] <0.85492414f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.453327f ? 
                                 (data[14 /* phishingTermsWeight */] <0.3194613f ? 
                                    0.08335784f : 
                                    0.003257297f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.10389004f : 
                                    0.16925117f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0588863f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    -0.058955222f : 
                                    -0.13558465f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.042977f : 
                                    -0.032317746f))))))) : 
         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[0])) ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (data[4 /* dotsCount */] <1.5f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.8525364f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.3126745f ? 
                            0.09525776f : 
                            0.18286765f) : 
                        0.021839987f) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5330245f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                             (data[14 /* phishingTermsWeight */] <1.8389196f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7492936f ? 
                                    -0.1376872f : 
                                    -0.11721007f) : 
                                 (data[14 /* phishingTermsWeight */] <1.9658898f ? 
                                    -0.11403442f : 
                                    -0.10971352f)) : 
                             (data[14 /* phishingTermsWeight */] <2.1376731f ? 
                                -0.0058414517f : 
                                 (data[14 /* phishingTermsWeight */] <2.5061564f ? 
                                    -0.11838101f : 
                                    -0.13037585f))) : 
                        -0.16696751f)) : 
                -0.13429362f) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.86849f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.1028914f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5286922f ? 
                                 (data[14 /* phishingTermsWeight */] <2.2367437f ? 
                                    0.028805735f : 
                                    -0.041174095f) : 
                                0.06926638f) : 
                            -0.118478365f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <7.65285f ? 
                             (data[4 /* dotsCount */] <2.5f ? 
                                0.12834202f : 
                                0.14064434f) : 
                            0.11881232f)) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.7023222f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.4838905f ? 
                                 (data[14 /* phishingTermsWeight */] <2.4026537f ? 
                                    0.14700177f : 
                                    0.11728985f) : 
                                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[11])) ? 
                                    0.13290396f : 
                                    0.22129968f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.960047f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.8366184f ? 
                                    0.10750553f : 
                                    -0.05189713f) : 
                                 (data[14 /* phishingTermsWeight */] <5.1067815f ? 
                                    0.14551963f : 
                                    0.12230484f))) : 
                         (data[14 /* phishingTermsWeight */] <2.2292678f ? 
                             (data[14 /* phishingTermsWeight */] <2.1110988f ? 
                                0.0124970805f : 
                                0.2616769f) : 
                             (data[14 /* phishingTermsWeight */] <2.7747622f ? 
                                 (data[14 /* phishingTermsWeight */] <2.275905f ? 
                                    -0.027939562f : 
                                    0.0024600483f) : 
                                 (data[14 /* phishingTermsWeight */] <4.2475967f ? 
                                    0.1282536f : 
                                    0.058527287f))))) : 
                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[11])) ? 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[10])) ? 
                        -0.08237531f : 
                         (data[14 /* phishingTermsWeight */] <2.474777f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.152511f ? 
                                0.02890316f : 
                                -0.13467613f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.10991f ? 
                                 (data[4 /* dotsCount */] <4.5f ? 
                                    0.02794846f : 
                                    0.16258009f) : 
                                -0.040383436f))) : 
                    0.1274342f))));
    return pred;
  } // constant pool size = 405B, number of visited nodes = 82, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_17 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_17_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_17_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                        -0.027440833f : 
                        0.042820588f) : 
                    0.2847796f) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                        0.10110821f : 
                        -0.0030727123f) : 
                    0.14572889f)) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <8.5f ? 
                                    -0.04706293f : 
                                    -0.112852626f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <16.0f ? 
                                    0.08687444f : 
                                    0.1617797f)) : 
                            -0.007822662f) : 
                        0.056168567f) : 
                    -0.0051335543f) : 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                     (data[7 /* imagesAsURL */] <15.0f ? 
                         (data[3 /* domainsCount */] <8.0f ? 
                             (data[4 /* dotsCount */] <2.5f ? 
                                -0.088384576f : 
                                0.10002328f) : 
                             (data[3 /* domainsCount */] <22.0f ? 
                                -0.13545853f : 
                                 (data[3 /* domainsCount */] <39.5f ? 
                                    -0.113519736f : 
                                    -0.11797682f))) : 
                         (data[3 /* domainsCount */] <5.5f ? 
                            -0.13966489f : 
                             (data[7 /* imagesAsURL */] <35.5f ? 
                                -0.1185099f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <12.5f ? 
                                    -0.11522002f : 
                                    -0.11240127f)))) : 
                    -0.055512607f))) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <10.0f ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <7.0f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                         (data[4 /* dotsCount */] <0.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                0.0938837f : 
                                0.1223772f) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                 (data[4 /* dotsCount */] <1.5f ? 
                                    0.12026265f : 
                                    0.1074024f) : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.0f ? 
                                    0.13708967f : 
                                    0.12217683f))) : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (data[3 /* domainsCount */] <2.5f ? 
                                 (data[3 /* domainsCount */] <1.5f ? 
                                    0.12737997f : 
                                    0.041789293f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                    0.11370725f : 
                                    0.13018067f)) : 
                             (data[2 /* hexadecimalURLs */] <2.5f ? 
                                -0.09734342f : 
                                0.11738155f))) : 
                    -0.030404765f) : 
                -0.03364778f) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <17.5f ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                    -0.12275787f : 
                    -0.051900182f) : 
                0.013944919f)));
    return pred;
  } // constant pool size = 178B, number of visited nodes = 39, static init size = 120B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_18 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_18_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_18_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                -0.14233898f : 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[12])) ? 
                    -0.118124776f : 
                    -0.07772597f)) : 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[12])) ? 
                        -0.067054495f : 
                        0.017585695f) : 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[12])) ? 
                        0.02227297f : 
                        0.02570062f)) : 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[15])) ? 
                    0.06313789f : 
                    0.09712148f))) : 
         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[15])) ? 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[9])) ? 
                0.07207715f : 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[12])) ? 
                    0.11552488f : 
                    0.13324241f)) : 
             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[0])) ? 
                0.113526314f : 
                0.11608973f)));
    return pred;
  } // constant pool size = 119B, number of visited nodes = 13, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_19 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_19_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_19_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[8])) ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                -0.021889549f : 
                                0.042076066f) : 
                            -0.12129587f) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                -0.0185525f : 
                                -4.6243428E-4f) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <3.5f ? 
                                0.031071128f : 
                                0.015510292f))) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <29.5f ? 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                             (data[7 /* imagesAsURL */] <11.5f ? 
                                -0.11528061f : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <17.5f ? 
                                    -0.12700072f : 
                                    -0.1183987f)) : 
                             (data[7 /* imagesAsURL */] <13.0f ? 
                                -0.08454014f : 
                                0.02972758f)) : 
                         (data[7 /* imagesAsURL */] <49.5f ? 
                            -0.14081052f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <132.5f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <112.5f ? 
                                    -0.11465594f : 
                                    -0.116652094f) : 
                                -0.11176061f)))) : 
                0.068062946f) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                    0.060824294f : 
                    0.08053619f) : 
                0.0382998f)) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <37.0f ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[11])) ? 
                     (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[8])) ? 
                        0.06571582f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                0.07730871f : 
                                0.12405016f) : 
                            0.064639255f)) : 
                     (Double.isNaN(data[13 /* isSuspendTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[13]) || (GenModel.bitSetIsInRange(32, 0, data[13]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[13])) ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                            0.115586884f : 
                            0.119703226f) : 
                        0.12599474f)) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[11])) ? 
                        0.11974679f : 
                        0.11049939f) : 
                    0.0103328535f)) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <95.5f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <75.5f ? 
                    -0.113533705f : 
                    -0.11672428f) : 
                -0.1389613f)));
    return pred;
  } // constant pool size = 185B, number of visited nodes = 32, static init size = 330B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_20 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_20_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_20_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
                     (data[3 /* domainsCount */] <0.5f ? 
                         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[12])) ? 
                            -0.12783778f : 
                            -0.07302866f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[12])) ? 
                                -0.1303567f : 
                                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                                    -0.037979335f : 
                                    0.022497352f)) : 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                                -0.013190432f : 
                                0.07825052f))) : 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
                         (data[3 /* domainsCount */] <0.5f ? 
                            0.08934309f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                 (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[12])) ? 
                                    -0.049250264f : 
                                    -0.039798833f) : 
                                -0.027609982f)) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                            0.12764719f : 
                            0.019354234f))) : 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[15])) ? 
                     (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[12])) ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                            -0.010478291f : 
                            -0.02647218f) : 
                        0.027996957f) : 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[9])) ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                            0.038487244f : 
                            0.05107387f) : 
                        0.110653065f))) : 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[15])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <21.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <19.0f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                    -0.0052914065f : 
                                    0.09692407f) : 
                                 (data[3 /* domainsCount */] <10.5f ? 
                                    -0.047676224f : 
                                    -0.037447944f)) : 
                             (data[3 /* domainsCount */] <16.5f ? 
                                0.09894536f : 
                                0.09807718f)) : 
                        -0.11631621f) : 
                    0.075526156f) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <23.5f ? 
                    0.12703075f : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <45.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <40.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <38.5f ? 
                                -0.11320007f : 
                                -0.11275081f) : 
                            -0.11761501f) : 
                        -0.034205075f)))) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[15])) ? 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[12])) ? 
                    -0.02061128f : 
                     (data[3 /* domainsCount */] <0.5f ? 
                        0.10380005f : 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[9])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[8])) ? 
                                    0.081976935f : 
                                    0.11605848f) : 
                                 (data[3 /* domainsCount */] <3.5f ? 
                                    -0.011572272f : 
                                    0.08260394f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.0f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    0.12897067f : 
                                    0.123697974f) : 
                                0.13408132f)))) : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[9])) ? 
                    0.11674295f : 
                    0.11439682f)) : 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[15])) ? 
                -0.1594203f : 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[9])) ? 
                    -0.0015921732f : 
                    0.1166575f))));
    return pred;
  } // constant pool size = 277B, number of visited nodes = 45, static init size = 570B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_21 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_21_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_21_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[5])) ? 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[12])) ? 
                -0.111048f : 
                -0.07892597f) : 
            0.02214881f) : 
         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <11.5f ? 
             (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[5])) ? 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[12])) ? 
                        -0.11839643f : 
                         (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                            -0.04115152f : 
                            0.009991581f)) : 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                            0.09807602f : 
                            0.07785868f) : 
                        0.11961089f)) : 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                     (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                         (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[12])) ? 
                            0.051263243f : 
                            0.12176482f) : 
                         (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[12])) ? 
                             (!Double.isNaN(data[13 /* isSuspendTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[13]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[13])) ? 
                                0.11447468f : 
                                0.100611925f) : 
                            0.09358428f)) : 
                     (data[2 /* hexadecimalURLs */] <1.5f ? 
                        0.0182988f : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <3.5f ? 
                            0.12641542f : 
                            0.115526676f)))) : 
            -0.11400801f));
    return pred;
  } // constant pool size = 120B, number of visited nodes = 17, static init size = 300B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_22 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_22_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_22_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (data[4 /* dotsCount */] <1.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                        -0.015967762f : 
                         (data[4 /* dotsCount */] <0.5f ? 
                            0.30886182f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                0.09688213f : 
                                0.047847115f))) : 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
                                    -0.08253859f : 
                                    -0.029033117f) : 
                                0.095056035f) : 
                             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[11])) ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    -0.015693774f : 
                                    -0.043860063f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    0.12268493f : 
                                    -0.06354431f))) : 
                        0.1331217f)) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                        -0.09929022f : 
                        -0.12737723f) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                         (data[3 /* domainsCount */] <2.5f ? 
                            0.012437655f : 
                            -0.04584145f) : 
                         (data[3 /* domainsCount */] <2.5f ? 
                            -0.025010565f : 
                            0.11510548f)))) : 
             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                -0.057716753f : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <23.5f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <5.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                    0.016848365f : 
                                    0.12314058f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                                    -0.054369394f : 
                                    0.047841217f)) : 
                             (data[3 /* domainsCount */] <6.5f ? 
                                0.16925943f : 
                                0.11002591f)) : 
                        0.089713246f) : 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <8.0f ? 
                        -0.06735391f : 
                        -0.11092307f)))) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <14.5f ? 
             (data[3 /* domainsCount */] <0.5f ? 
                0.081289545f : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[11])) ? 
                         (data[4 /* dotsCount */] <1.5f ? 
                            0.11226935f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                 (data[3 /* domainsCount */] <1.5f ? 
                                    0.11628526f : 
                                    0.116452225f) : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                    0.11187752f : 
                                    0.11554468f))) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    0.09192821f : 
                                    0.11654438f) : 
                                 (data[3 /* domainsCount */] <5.5f ? 
                                    -0.01617574f : 
                                    0.118565515f)) : 
                             (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                                0.12395745f : 
                                0.13114785f))) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                             (data[3 /* domainsCount */] <1.5f ? 
                                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                                    0.1131402f : 
                                    0.12280434f) : 
                                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[11])) ? 
                                    0.0016728737f : 
                                    0.11819329f)) : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[11])) ? 
                                    0.114539705f : 
                                    0.110181965f) : 
                                0.031639636f)) : 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[11])) ? 
                             (data[3 /* domainsCount */] <7.5f ? 
                                -0.07549742f : 
                                 (data[3 /* domainsCount */] <8.5f ? 
                                    0.044837356f : 
                                    -0.024309978f)) : 
                            0.1250636f)))) : 
             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                    -0.09741809f : 
                    -0.19225976f) : 
                 (data[4 /* dotsCount */] <2.5f ? 
                    -0.11583086f : 
                     (data[3 /* domainsCount */] <25.0f ? 
                        0.11742129f : 
                        0.12368482f)))));
    return pred;
  } // constant pool size = 277B, number of visited nodes = 55, static init size = 330B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_23 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_23_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_23_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (data[3 /* domainsCount */] <0.5f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8373009f ? 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.31398785f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.13344483f ? 
                                -0.065706804f : 
                                -0.11252659f) : 
                            -0.11718971f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.19624239f ? 
                            0.052570168f : 
                             (data[14 /* phishingTermsWeight */] <0.3917434f ? 
                                0.3785224f : 
                                0.22203153f))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.96881425f ? 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
                            -0.12247505f : 
                            -0.11380094f) : 
                         (data[14 /* phishingTermsWeight */] <1.1846992f ? 
                            0.028035592f : 
                            -0.043733753f))) : 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[11])) ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                            -0.12873007f : 
                            -0.1471132f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.13241f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.84930754f ? 
                                    -0.072012156f : 
                                    -0.08289515f) : 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                    -0.09914632f : 
                                    0.0679043f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8493075f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.1486288f ? 
                                    -0.042752262f : 
                                    0.10722504f) : 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                                    -0.08447762f : 
                                    -0.03801906f)))) : 
                    0.07052288f)) : 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                     (data[14 /* phishingTermsWeight */] <0.8536184f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.09336451f ? 
                             (data[3 /* domainsCount */] <5.5f ? 
                                -0.11054702f : 
                                -0.12167179f) : 
                            0.12545155f) : 
                         (data[14 /* phishingTermsWeight */] <1.0361354f ? 
                            -0.13322239f : 
                             (data[3 /* domainsCount */] <5.5f ? 
                                -0.08577844f : 
                                0.024709554f))) : 
                    0.11108754f) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.1603727f ? 
                    0.14063643f : 
                    0.20296763f))) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.254718f ? 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[12])) ? 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[15])) ? 
                        -0.15837239f : 
                        0.09033098f) : 
                     (data[14 /* phishingTermsWeight */] <2.1166613f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8173335f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7724342f ? 
                                 (data[14 /* phishingTermsWeight */] <1.6515806f ? 
                                    0.14079823f : 
                                    0.04687826f) : 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[15])) ? 
                                    0.12824874f : 
                                    0.19101693f)) : 
                             (data[3 /* domainsCount */] <1.5f ? 
                                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[15])) ? 
                                    0.07450964f : 
                                    0.07183212f) : 
                                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[15])) ? 
                                    -0.074309275f : 
                                    0.043845184f))) : 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[11])) ? 
                             (data[3 /* domainsCount */] <1.5f ? 
                                 (data[14 /* phishingTermsWeight */] <3.2377548f ? 
                                    0.024504537f : 
                                    0.11620246f) : 
                                 (data[14 /* phishingTermsWeight */] <3.2377548f ? 
                                    0.12567009f : 
                                    0.12099478f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5046818f ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[15])) ? 
                                    0.081397526f : 
                                    0.13407438f) : 
                                 (data[14 /* phishingTermsWeight */] <3.5420516f ? 
                                    0.21380652f : 
                                    0.10956564f))))) : 
                 (data[3 /* domainsCount */] <0.5f ? 
                    0.03542199f : 
                     (data[14 /* phishingTermsWeight */] <4.9372215f ? 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[11])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    0.11440487f : 
                                    0.04548444f) : 
                                -0.100588106f) : 
                             (data[14 /* phishingTermsWeight */] <4.528051f ? 
                                0.11293304f : 
                                0.1148363f)) : 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[11])) ? 
                             (data[14 /* phishingTermsWeight */] <5.6766005f ? 
                                 (data[14 /* phishingTermsWeight */] <5.395988f ? 
                                    0.11017221f : 
                                    0.11520125f) : 
                                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[9])) ? 
                                    0.10663941f : 
                                    0.1105348f)) : 
                             (data[14 /* phishingTermsWeight */] <5.0850973f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.0562053f ? 
                                    0.13526352f : 
                                    0.11166381f) : 
                                 (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[12])) ? 
                                    0.11530118f : 
                                    0.119824596f)))))) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <14.5f ? 
                 (data[14 /* phishingTermsWeight */] <2.2292678f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                         (data[14 /* phishingTermsWeight */] <2.0444944f ? 
                            0.14222412f : 
                             (data[14 /* phishingTermsWeight */] <2.1316655f ? 
                                0.2591696f : 
                                0.076386146f)) : 
                        0.0038329416f) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.8398504f ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[9])) ? 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[15])) ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.6772144f ? 
                                    -0.11221319f : 
                                    0.042906664f) : 
                                 (data[14 /* phishingTermsWeight */] <3.4969947f ? 
                                    0.1324681f : 
                                    0.0060638525f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                 (data[14 /* phishingTermsWeight */] <3.631579f ? 
                                    0.1482299f : 
                                    0.12195998f) : 
                                -0.021015054f)) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.72765f ? 
                            0.1209483f : 
                             (data[14 /* phishingTermsWeight */] <7.28156f ? 
                                0.120385446f : 
                                0.116187714f)))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.249479f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.242468f ? 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT20, 32, 0, data[15])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.339313f ? 
                                 (data[14 /* phishingTermsWeight */] <2.3182464f ? 
                                    -0.108066306f : 
                                    -0.11173593f) : 
                                0.053875446f) : 
                             (data[14 /* phishingTermsWeight */] <2.7372098f ? 
                                0.079370186f : 
                                -0.07176095f)) : 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT21, 32, 0, data[9])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.9680853f ? 
                                -0.13102286f : 
                                -0.13226302f) : 
                            -0.07235187f)) : 
                     (data[14 /* phishingTermsWeight */] <7.653963f ? 
                        0.12424357f : 
                        0.11401795f)))));
    return pred;
  } // constant pool size = 452B, number of visited nodes = 85, static init size = 660B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT20 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT21 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_24 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_24_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_24_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[12])) ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.192867f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.2773113f ? 
                                -0.111880004f : 
                                -0.11396962f) : 
                            -0.105729535f) : 
                         (data[14 /* phishingTermsWeight */] <0.34409624f ? 
                            -0.10698346f : 
                            -0.108482264f)) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8143611f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.24176344f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.024176344f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                    -0.0542234f : 
                                    0.017784027f) : 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                                    -0.05986083f : 
                                    0.10789158f)) : 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                                 (data[14 /* phishingTermsWeight */] <0.6031768f ? 
                                    -0.036950015f : 
                                    0.00520849f) : 
                                 (data[14 /* phishingTermsWeight */] <0.32516652f ? 
                                    0.24541181f : 
                                    0.08211768f))) : 
                         (data[14 /* phishingTermsWeight */] <0.92673004f ? 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                -0.107827485f : 
                                -0.08940353f) : 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <5.5f ? 
                                    -0.08341333f : 
                                    -0.112608284f) : 
                                 (data[14 /* phishingTermsWeight */] <1.1162249f ? 
                                    -0.0615296f : 
                                    0.041039042f))))) : 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                    0.0033012116f : 
                     (data[14 /* phishingTermsWeight */] <0.103228875f ? 
                        -0.075627856f : 
                         (data[14 /* phishingTermsWeight */] <0.8522611f ? 
                            0.17784335f : 
                            0.14211911f)))) : 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                0.01239232f : 
                0.15604402f)) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[12])) ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[15])) ? 
                    -0.04536785f : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                         (data[14 /* phishingTermsWeight */] <4.561604f ? 
                            0.011537889f : 
                            0.11896137f) : 
                        0.114176944f)) : 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[15])) ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.1933403f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.39074f ? 
                                 (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                                    0.07376092f : 
                                    0.13646407f) : 
                                 (data[14 /* phishingTermsWeight */] <3.547495f ? 
                                    0.16884257f : 
                                    0.110710785f)) : 
                             (data[14 /* phishingTermsWeight */] <4.9336195f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.7382984f ? 
                                    0.073598586f : 
                                    -0.031296834f) : 
                                 (data[14 /* phishingTermsWeight */] <5.0816755f ? 
                                    0.12507991f : 
                                    0.093471184f))) : 
                         (data[14 /* phishingTermsWeight */] <3.456813f ? 
                            -0.038053196f : 
                             (data[14 /* phishingTermsWeight */] <4.017377f ? 
                                0.12583241f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.2879887f ? 
                                    0.11061688f : 
                                    0.056179278f)))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8250768f ? 
                         (data[14 /* phishingTermsWeight */] <1.9443551f ? 
                             (data[14 /* phishingTermsWeight */] <1.6516013f ? 
                                0.21066603f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7561113f ? 
                                    -0.0018819968f : 
                                    0.06725226f)) : 
                             (data[14 /* phishingTermsWeight */] <2.5930552f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.4012127f ? 
                                    0.11200918f : 
                                    0.19231425f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3158925f ? 
                                    0.10452872f : 
                                    0.13974974f))) : 
                         (data[14 /* phishingTermsWeight */] <4.8369517f ? 
                             (data[14 /* phishingTermsWeight */] <4.0007505f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9417245f ? 
                                    0.1478398f : 
                                    -0.09989824f) : 
                                 (data[14 /* phishingTermsWeight */] <4.265169f ? 
                                    0.14754362f : 
                                    0.11998994f)) : 
                             (data[14 /* phishingTermsWeight */] <5.1405144f ? 
                                0.0023401682f : 
                                 (data[14 /* phishingTermsWeight */] <5.4137206f ? 
                                    0.11383735f : 
                                    0.110235125f)))))) : 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.0500026f ? 
                 (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.524848f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.6663263f ? 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[15])) ? 
                                 (data[7 /* imagesAsURL */] <44.0f ? 
                                    -0.138208f : 
                                    -0.116165616f) : 
                                 (data[14 /* phishingTermsWeight */] <2.7004895f ? 
                                    -0.107481755f : 
                                    -0.11690015f)) : 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[15])) ? 
                                -0.119388826f : 
                                0.024589032f)) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <15.0f ? 
                            -0.11853679f : 
                            -0.14905189f)) : 
                     (data[14 /* phishingTermsWeight */] <2.2702718f ? 
                         (data[7 /* imagesAsURL */] <97.5f ? 
                            0.15460455f : 
                            -0.111263864f) : 
                         (data[7 /* imagesAsURL */] <59.0f ? 
                             (data[14 /* phishingTermsWeight */] <4.0844874f ? 
                                -0.13307995f : 
                                -0.113115646f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.4958448f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <111.5f ? 
                                    -0.106597565f : 
                                    -0.11004071f) : 
                                -0.11083112f)))) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                    0.11453756f : 
                    0.1293591f))));
    return pred;
  } // constant pool size = 361B, number of visited nodes = 71, static init size = 450B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_25 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_25_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_25_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[10])) ? 
             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[6])) ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3469653f ? 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.883946f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.1325919f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.06629595f ? 
                                    -0.049140852f : 
                                    -0.08276492f) : 
                                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                                    -0.014762074f : 
                                    0.07103996f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0857548f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.008104f ? 
                                    -0.07225116f : 
                                    -0.13126242f) : 
                                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                                    -0.10613519f : 
                                    0.026403442f))) : 
                        0.053963207f) : 
                     (data[14 /* phishingTermsWeight */] <1.3687396f ? 
                        -0.13645253f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.427761f ? 
                            -0.10700279f : 
                            -0.1532287f))) : 
                0.041709304f) : 
             (data[14 /* phishingTermsWeight */] <0.60642594f ? 
                -0.12946835f : 
                 (data[14 /* phishingTermsWeight */] <1.0805001f ? 
                    0.2231457f : 
                    -0.02161341f))) : 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9171426f ? 
             (data[14 /* phishingTermsWeight */] <1.6304651f ? 
                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[6])) ? 
                    -0.030823316f : 
                    0.18605062f) : 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[0])) ? 
                     (data[14 /* phishingTermsWeight */] <1.771809f ? 
                         (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[5])) ? 
                            -0.11864961f : 
                            0.050720263f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.063732f ? 
                             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[6])) ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.3598428f ? 
                                    -0.110931456f : 
                                    -0.013197635f) : 
                                0.09309199f) : 
                             (data[14 /* phishingTermsWeight */] <3.298627f ? 
                                -0.18225738f : 
                                -0.06552756f))) : 
                     (data[14 /* phishingTermsWeight */] <2.2311766f ? 
                         (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[5])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.0654247f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7691728f ? 
                                    0.045690205f : 
                                    0.13498156f) : 
                                0.029047564f) : 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                                 (data[14 /* phishingTermsWeight */] <2.0516121f ? 
                                    0.1324159f : 
                                    0.12761146f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.9825488f ? 
                                    0.04742768f : 
                                    0.1936989f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3210702f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.212509f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.1148038f ? 
                                    0.08267868f : 
                                    0.15841332f) : 
                                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[6])) ? 
                                    -0.08533826f : 
                                    0.1092998f)) : 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[6])) ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.6493356f ? 
                                    0.046559215f : 
                                    0.10875544f) : 
                                 (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[5])) ? 
                                    0.108436085f : 
                                    0.16337226f)))))) : 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[0])) ? 
                -0.12488412f : 
                 (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[5])) ? 
                     (data[14 /* phishingTermsWeight */] <4.1717625f ? 
                        0.06637837f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.7489257f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.506344f ? 
                                -0.011562221f : 
                                -0.019290505f) : 
                            -0.04795783f)) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.123847f ? 
                         (data[14 /* phishingTermsWeight */] <4.007333f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9697816f ? 
                                0.11026905f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.982977f ? 
                                    -0.027140837f : 
                                    -0.02989685f)) : 
                             (data[14 /* phishingTermsWeight */] <4.217403f ? 
                                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[6])) ? 
                                    0.11195988f : 
                                    0.1319656f) : 
                                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[9])) ? 
                                    0.030205274f : 
                                    0.074967206f))) : 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[10])) ? 
                             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[9])) ? 
                                0.10730931f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <7.1720314f ? 
                                    0.11322093f : 
                                    0.10920245f)) : 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT20, 32, 0, data[6])) ? 
                                 (data[14 /* phishingTermsWeight */] <7.7364388f ? 
                                    0.11231973f : 
                                    0.10973401f) : 
                                 (data[14 /* phishingTermsWeight */] <6.4463654f ? 
                                    0.11698807f : 
                                    0.117138624f))))))));
    return pred;
  } // constant pool size = 339B, number of visited nodes = 58, static init size = 630B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT20 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_26 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_26_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_26_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[6])) ? 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[12])) ? 
                -0.109412156f : 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <37.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                             (data[3 /* domainsCount */] <0.5f ? 
                                -0.0074261758f : 
                                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                                    -0.042124666f : 
                                    0.054446567f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <10.5f ? 
                                    0.0076230704f : 
                                    -0.049395654f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <17.5f ? 
                                    0.08401531f : 
                                    0.02382833f))) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <46.5f ? 
                            -0.10888565f : 
                            0.023027942f)) : 
                    0.012560913f)) : 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                0.0399388f : 
                0.12979467f)) : 
         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[10])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <18.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.0f ? 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[6])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                0.04052266f : 
                                -0.010695097f) : 
                            0.10618278f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                                0.107397854f : 
                                0.115341164f) : 
                            0.028443815f)) : 
                    -0.112072214f) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <18.5f ? 
                     (data[3 /* domainsCount */] <2.5f ? 
                        -0.012506657f : 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                            0.1091602f : 
                            0.11424478f)) : 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[6])) ? 
                        0.110229686f : 
                        0.11593712f))) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <28.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <13.5f ? 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[6])) ? 
                         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[12])) ? 
                            -0.0016701281f : 
                             (data[3 /* domainsCount */] <0.5f ? 
                                0.121583186f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                    0.10285249f : 
                                    0.11249016f))) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[12])) ? 
                                 (data[3 /* domainsCount */] <1.5f ? 
                                    -0.06533701f : 
                                    0.12827002f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    0.0797347f : 
                                    0.065348685f)) : 
                             (data[3 /* domainsCount */] <7.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                                    0.02642872f : 
                                    -0.035480756f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                    0.12071995f : 
                                    0.022748152f)))) : 
                    -0.046730068f) : 
                -0.13079606f)));
    return pred;
  } // constant pool size = 229B, number of visited nodes = 38, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_27 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_27_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_27_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[11])) ? 
         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <18.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                     (data[3 /* domainsCount */] <0.5f ? 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                            -0.05534623f : 
                            0.07119455f) : 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[9])) ? 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    -0.03323925f : 
                                    -0.028874256f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    -0.01785139f : 
                                    0.0018409097f)) : 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                                0.018981796f : 
                                 (data[3 /* domainsCount */] <1.5f ? 
                                    0.1257656f : 
                                    0.040721714f)))) : 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                    -0.018571807f : 
                                    -0.045104336f) : 
                                 (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                                    0.019832063f : 
                                    0.12579013f)) : 
                            0.07585812f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                0.04614333f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                                    0.056473576f : 
                                    0.047907043f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                    0.11438683f : 
                                    0.17942713f) : 
                                 (data[3 /* domainsCount */] <10.0f ? 
                                    0.029038938f : 
                                    0.081459664f))))) : 
                 (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                    -0.11709704f : 
                    -0.11044332f)) : 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[15])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <18.5f ? 
                     (data[3 /* domainsCount */] <0.5f ? 
                        -0.088579744f : 
                         (data[3 /* domainsCount */] <2.5f ? 
                            -0.0016206006f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                                0.07037657f : 
                                -0.0057000034f))) : 
                    -0.11864771f) : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[9])) ? 
                    0.038101f : 
                     (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.02311747f : 
                        0.08192447f)))) : 
         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[10])) ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[15])) ? 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[9])) ? 
                    0.035072435f : 
                    0.06810162f) : 
                0.053817376f) : 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[15])) ? 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[9])) ? 
                    0.106872715f : 
                    0.10830538f) : 
                 (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[1])) ? 
                    0.10750226f : 
                    0.11235775f))));
    return pred;
  } // constant pool size = 245B, number of visited nodes = 37, static init size = 570B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_28 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_28_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_28_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
             (data[3 /* domainsCount */] <0.5f ? 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
                    -0.058075044f : 
                    0.05535545f) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                        -0.05063303f : 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                            -0.044623546f : 
                            -0.027843604f)) : 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                        -0.024468012f : 
                        -0.0025133702f))) : 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                 (data[3 /* domainsCount */] <0.5f ? 
                    -0.02614929f : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[10])) ? 
                            0.026286405f : 
                            0.07724791f) : 
                        0.106725484f)) : 
                 (data[3 /* domainsCount */] <0.5f ? 
                    0.10452947f : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                         (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[8])) ? 
                            0.10828382f : 
                             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[10])) ? 
                                0.08955846f : 
                                0.11352769f)) : 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[10])) ? 
                             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[8])) ? 
                                0.008423729f : 
                                0.114697106f) : 
                            0.046911344f))))) : 
         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[15])) ? 
             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[8])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <21.5f ? 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[5])) ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[10])) ? 
                                    -0.032681983f : 
                                    0.032336865f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <11.5f ? 
                                    -0.06829207f : 
                                    -0.11315349f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <16.5f ? 
                                0.06539974f : 
                                0.021227494f)) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <19.5f ? 
                             (data[3 /* domainsCount */] <5.5f ? 
                                 (data[3 /* domainsCount */] <3.5f ? 
                                    0.06277216f : 
                                    0.11258973f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <10.5f ? 
                                    0.029698148f : 
                                    0.1137927f)) : 
                            -0.1096641f)) : 
                    0.03975896f) : 
                 (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[5])) ? 
                    -0.008314235f : 
                    0.114712976f)) : 
             (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[5])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <21.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[10])) ? 
                                0.1140416f : 
                                0.11611461f) : 
                            0.11166634f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <11.5f ? 
                             (data[3 /* domainsCount */] <7.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                                    -0.019082263f : 
                                    -0.030784184f) : 
                                 (data[3 /* domainsCount */] <8.5f ? 
                                    0.10928922f : 
                                    0.034785572f)) : 
                            -0.050898854f)) : 
                    -0.11841153f) : 
                0.047795016f)));
    return pred;
  } // constant pool size = 256B, number of visited nodes = 41, static init size = 540B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_29 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_29_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_29_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[12])) ? 
                        -0.10828161f : 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[6])) ? 
                            0.0021924058f : 
                            0.02358048f)) : 
                    0.0684729f) : 
                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[6])) ? 
                    0.08876086f : 
                    0.13357444f)) : 
             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[6])) ? 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[12])) ? 
                    -0.108532704f : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <8.5f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <6.5f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                    -0.030271675f : 
                                    -0.06839688f) : 
                                0.0642558f) : 
                            -0.13682017f) : 
                        -0.11086133f)) : 
                 (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                    -0.047838796f : 
                    0.035950277f))) : 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[6])) ? 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[12])) ? 
                        -0.041347355f : 
                         (data[4 /* dotsCount */] <0.5f ? 
                            0.11671335f : 
                             (data[4 /* dotsCount */] <1.5f ? 
                                0.10509391f : 
                                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[10])) ? 
                                    0.10705093f : 
                                    0.10100659f)))) : 
                     (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.0049092984f : 
                         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[12])) ? 
                            1.1805262E-4f : 
                             (data[4 /* dotsCount */] <1.5f ? 
                                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[10])) ? 
                                    0.071640015f : 
                                    0.13426426f) : 
                                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[10])) ? 
                                    0.052120805f : 
                                    0.11242042f))))) : 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[10])) ? 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[6])) ? 
                        -0.008366664f : 
                        0.068805255f) : 
                     (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[12])) ? 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[6])) ? 
                             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[1])) ? 
                                0.03157505f : 
                                0.037644982f) : 
                            0.10870551f) : 
                        0.109673336f))) : 
             (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT20, 32, 0, data[1])) ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <6.5f ? 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT21, 32, 0, data[6])) ? 
                        -0.0639944f : 
                        0.10976801f) : 
                    -0.067686185f) : 
                0.10971735f)));
    return pred;
  } // constant pool size = 248B, number of visited nodes = 34, static init size = 660B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT20 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT21 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_30 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_30_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_30_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[9])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.825831f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.28904086f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.13729441f ? 
                                    -0.04277059f : 
                                    -0.008118171f) : 
                                 (data[14 /* phishingTermsWeight */] <0.3271966f ? 
                                    0.1938418f : 
                                    0.02546028f)) : 
                             (data[14 /* phishingTermsWeight */] <0.922178f ? 
                                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                                    -0.07886378f : 
                                    -0.106657945f) : 
                                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                                    -0.10572834f : 
                                    -0.0029484392f))) : 
                         (data[14 /* phishingTermsWeight */] <0.734072f ? 
                            -0.007829531f : 
                            0.06888743f)) : 
                     (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                        -0.0030574354f : 
                        0.08965765f)) : 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[0])) ? 
                    -0.1117587f : 
                     (data[14 /* phishingTermsWeight */] <0.21792762f ? 
                        -0.02374432f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.84482396f ? 
                            0.1793644f : 
                            0.15680826f)))) : 
             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <5.5f ? 
                0.078418195f : 
                0.07262538f)) : 
         (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.65367f ? 
                     (data[14 /* phishingTermsWeight */] <2.2732747f ? 
                        0.034939907f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.654882f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3208013f ? 
                                 (data[14 /* phishingTermsWeight */] <2.9700167f ? 
                                    -0.11264292f : 
                                    -0.10609302f) : 
                                -0.13124722f) : 
                            0.018489465f)) : 
                    0.113951676f) : 
                 (data[14 /* phishingTermsWeight */] <4.3467836f ? 
                    0.12070196f : 
                     (data[14 /* phishingTermsWeight */] <4.9720645f ? 
                        -0.10861803f : 
                         (data[14 /* phishingTermsWeight */] <7.570888f ? 
                            0.112622775f : 
                             (data[2 /* hexadecimalURLs */] <0.5f ? 
                                0.106686205f : 
                                0.106652245f))))) : 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[0])) ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.9964838f ? 
                     (data[14 /* phishingTermsWeight */] <1.7677158f ? 
                         (data[14 /* phishingTermsWeight */] <1.7214948f ? 
                            -0.034141615f : 
                            0.015741182f) : 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.5362906f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.3105836f ? 
                                    -0.1251062f : 
                                    0.15855247f) : 
                                -0.09822873f) : 
                            0.08150921f)) : 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                        -0.11158521f : 
                         (data[14 /* phishingTermsWeight */] <3.4731963f ? 
                            -0.15305291f : 
                            -0.08487449f))) : 
                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[6])) ? 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[9])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.9298673f ? 
                             (data[14 /* phishingTermsWeight */] <2.393824f ? 
                                 (data[14 /* phishingTermsWeight */] <2.055685f ? 
                                    0.06491593f : 
                                    0.12153671f) : 
                                 (data[14 /* phishingTermsWeight */] <2.6392062f ? 
                                    -0.1075975f : 
                                    0.09810563f)) : 
                             (data[14 /* phishingTermsWeight */] <5.0781107f ? 
                                -0.14751887f : 
                                 (data[14 /* phishingTermsWeight */] <5.641436f ? 
                                    0.03073391f : 
                                    0.107059f))) : 
                         (data[14 /* phishingTermsWeight */] <2.7202861f ? 
                            0.12463135f : 
                             (data[14 /* phishingTermsWeight */] <5.0388165f ? 
                                0.1109714f : 
                                 (data[14 /* phishingTermsWeight */] <6.0306325f ? 
                                    0.104784995f : 
                                    0.10597728f)))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5795677f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.45072f ? 
                             (data[14 /* phishingTermsWeight */] <1.6146413f ? 
                                0.18703975f : 
                                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[9])) ? 
                                    0.022756746f : 
                                    0.08472693f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5226703f ? 
                                0.19142309f : 
                                0.12816468f)) : 
                         (data[14 /* phishingTermsWeight */] <4.0137005f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.91817f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.75338f ? 
                                    0.055913843f : 
                                    0.14510864f) : 
                                -0.046647083f) : 
                             (data[14 /* phishingTermsWeight */] <4.165647f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.072381f ? 
                                    0.089718744f : 
                                    0.17047966f) : 
                                 (data[14 /* phishingTermsWeight */] <4.887393f ? 
                                    0.030466888f : 
                                    0.076509535f))))))));
    return pred;
  } // constant pool size = 312B, number of visited nodes = 60, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_31 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_31_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_31_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                 (data[4 /* dotsCount */] <1.5f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.84877074f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.23341195f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.04668239f ? 
                                    0.010609415f : 
                                    -0.10988292f) : 
                                 (data[14 /* phishingTermsWeight */] <0.54381657f ? 
                                    0.1666147f : 
                                    0.029506769f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9710656f ? 
                                -0.11282648f : 
                                 (data[14 /* phishingTermsWeight */] <1.1820242f ? 
                                    0.07563544f : 
                                    -0.034438815f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.94052976f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.5643179f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.028215894f ? 
                                    0.043953367f : 
                                    0.10897362f) : 
                                 (data[14 /* phishingTermsWeight */] <0.84376943f ? 
                                    0.0078869015f : 
                                    -0.003507824f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.2256168f ? 
                                0.1731464f : 
                                0.12517007f))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4222645f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0666983f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.82216066f ? 
                                    -0.06063615f : 
                                    -0.08066353f) : 
                                 (data[4 /* dotsCount */] <6.5f ? 
                                    0.0982168f : 
                                    -0.11929982f)) : 
                             (data[14 /* phishingTermsWeight */] <1.2236646f ? 
                                0.026739921f : 
                                 (data[14 /* phishingTermsWeight */] <1.329181f ? 
                                    -0.12891513f : 
                                    -0.06423803f))) : 
                        -0.15107068f)) : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                     (data[14 /* phishingTermsWeight */] <0.2867469f ? 
                        0.056552585f : 
                        0.11788973f) : 
                    -0.033514727f)) : 
             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <5.5f ? 
                0.07158683f : 
                0.06601779f)) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8250768f ? 
                     (data[14 /* phishingTermsWeight */] <2.0947733f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8244134f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7784523f ? 
                                 (data[14 /* phishingTermsWeight */] <1.6547401f ? 
                                    0.108791396f : 
                                    0.022126932f) : 
                                 (data[4 /* dotsCount */] <1.5f ? 
                                    0.09452808f : 
                                    0.16009292f)) : 
                             (data[4 /* dotsCount */] <1.5f ? 
                                0.09451679f : 
                                -0.009684783f)) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.466046f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.1933355f ? 
                                    0.09677114f : 
                                    0.07115633f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5431802f ? 
                                    0.17097774f : 
                                    0.070620164f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.294637f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.976883f ? 
                                    0.039962098f : 
                                    -0.048270375f) : 
                                0.119371004f))) : 
                     (data[4 /* dotsCount */] <0.5f ? 
                         (data[14 /* phishingTermsWeight */] <4.619243f ? 
                            -0.11832151f : 
                             (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[8])) ? 
                                0.107446335f : 
                                0.108666316f)) : 
                         (data[14 /* phishingTermsWeight */] <4.271035f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (data[4 /* dotsCount */] <1.5f ? 
                                    0.11685222f : 
                                    0.07528124f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9785404f ? 
                                    0.10063009f : 
                                    0.15396751f)) : 
                             (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[8])) ? 
                                 (data[4 /* dotsCount */] <1.5f ? 
                                    0.10607309f : 
                                    -0.009618936f) : 
                                 (data[14 /* phishingTermsWeight */] <5.078878f ? 
                                    0.10535795f : 
                                    0.09679552f))))) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.4208856f ? 
                        -0.052721903f : 
                        0.124561034f) : 
                    -0.07757228f)) : 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.0500026f ? 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <8.0f ? 
                     (data[7 /* imagesAsURL */] <15.0f ? 
                         (data[7 /* imagesAsURL */] <8.5f ? 
                             (data[4 /* dotsCount */] <2.5f ? 
                                -0.04435735f : 
                                0.0025982896f) : 
                             (data[14 /* phishingTermsWeight */] <3.2914622f ? 
                                0.030385982f : 
                                 (data[14 /* phishingTermsWeight */] <4.4161754f ? 
                                    -0.120527945f : 
                                    -0.15477142f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.524848f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.7092218f ? 
                                 (data[7 /* imagesAsURL */] <56.5f ? 
                                    -0.12960859f : 
                                    -0.11143186f) : 
                                -0.047034178f) : 
                            -0.13553637f)) : 
                    -0.109612934f) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                    0.1074472f : 
                    0.11704395f))));
    return pred;
  } // constant pool size = 268B, number of visited nodes = 64, static init size = 60B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_32 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_32_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_32_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                -0.06462937f : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                     (data[3 /* domainsCount */] <0.5f ? 
                        -0.021193465f : 
                        -0.002157011f) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                            0.03148846f : 
                            0.037262294f) : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                0.058375787f : 
                                0.0476973f) : 
                            0.13529836f)))) : 
             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                -0.04976704f : 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                    -0.112204045f : 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <10.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <19.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                                    0.046674967f : 
                                    -0.017248018f) : 
                                -0.042218745f) : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                 (data[3 /* domainsCount */] <9.5f ? 
                                    0.15360524f : 
                                    0.11382407f) : 
                                0.09713143f)) : 
                        -0.10863065f)))) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <14.5f ? 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                    0.04846592f : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                        -0.09822086f : 
                        -0.15560739f)) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                     (data[3 /* domainsCount */] <0.5f ? 
                        0.019473204f : 
                         (data[3 /* domainsCount */] <1.5f ? 
                            0.11316941f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                    0.06549627f : 
                                    0.10890731f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    0.11246243f : 
                                    0.10989947f)))) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <10.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                             (data[3 /* domainsCount */] <6.5f ? 
                                 (data[3 /* domainsCount */] <5.5f ? 
                                    0.010139361f : 
                                    0.06881075f) : 
                                 (data[3 /* domainsCount */] <7.5f ? 
                                    -0.018638972f : 
                                    0.0274782f)) : 
                            0.11731294f) : 
                         (data[2 /* hexadecimalURLs */] <1.0f ? 
                            0.120915264f : 
                            0.106756926f)))) : 
             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                 (data[3 /* domainsCount */] <39.0f ? 
                    -0.14330451f : 
                    -0.11641839f) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <23.0f ? 
                     (data[3 /* domainsCount */] <19.5f ? 
                        0.10802177f : 
                        -0.10675122f) : 
                    0.11057457f))));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 37, static init size = 180B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_33 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_33_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_33_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4271418f ? 
             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[9])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8139168f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.1271745f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.06676661f ? 
                                -0.034693364f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.102946065f ? 
                                    -0.10638122f : 
                                    -0.035795357f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.61336637f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.5433836f ? 
                                    0.049467895f : 
                                    -0.123216555f) : 
                                 (data[14 /* phishingTermsWeight */] <0.7885631f ? 
                                    0.17965323f : 
                                    0.024512246f))) : 
                         (data[14 /* phishingTermsWeight */] <0.97371566f ? 
                            -0.06763495f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3934226f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3526953f ? 
                                    -0.04497489f : 
                                    -0.12768999f) : 
                                0.11661812f))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0257581f ? 
                        -0.016753813f : 
                        0.13315001f)) : 
                0.029368851f) : 
            -0.14846489f) : 
         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[5])) ? 
             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[6])) ? 
                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[8])) ? 
                     (data[14 /* phishingTermsWeight */] <4.1933403f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.018515f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.4041986f ? 
                                 (data[14 /* phishingTermsWeight */] <3.0182476f ? 
                                    0.10755884f : 
                                    0.10879819f) : 
                                 (data[14 /* phishingTermsWeight */] <3.656237f ? 
                                    0.102819666f : 
                                    0.1053029f)) : 
                            0.117993996f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.6433783f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.031005f ? 
                                 (data[14 /* phishingTermsWeight */] <4.450951f ? 
                                    0.03402763f : 
                                    0.10645249f) : 
                                 (data[14 /* phishingTermsWeight */] <5.1223373f ? 
                                    -0.07150752f : 
                                    0.048045732f)) : 
                             (data[14 /* phishingTermsWeight */] <6.0139437f ? 
                                 (data[14 /* phishingTermsWeight */] <5.737558f ? 
                                    0.104104176f : 
                                    0.10403877f) : 
                                 (data[14 /* phishingTermsWeight */] <6.347452f ? 
                                    0.10689349f : 
                                    0.10454949f)))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.4029217f ? 
                         (data[14 /* phishingTermsWeight */] <5.367532f ? 
                            0.10616932f : 
                            0.104861654f) : 
                        0.10847379f)) : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                     (data[14 /* phishingTermsWeight */] <2.7202861f ? 
                        -0.08065187f : 
                         (data[14 /* phishingTermsWeight */] <3.2326589f ? 
                            0.11097653f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.7091274f ? 
                                 (data[14 /* phishingTermsWeight */] <4.6209064f ? 
                                    0.04557111f : 
                                    -0.051082123f) : 
                                0.10864228f))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.9298673f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.531778f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.113784f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8769207f ? 
                                    0.035156056f : 
                                    0.0012190106f) : 
                                 (data[14 /* phishingTermsWeight */] <4.2655f ? 
                                    0.123239785f : 
                                    0.038186148f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.619055f ? 
                                -0.043416683f : 
                                0.0614549f)) : 
                         (data[14 /* phishingTermsWeight */] <5.128876f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.9903545f ? 
                                0.11555142f : 
                                0.114192784f) : 
                             (data[14 /* phishingTermsWeight */] <5.513627f ? 
                                -0.081888236f : 
                                 (data[14 /* phishingTermsWeight */] <5.7444777f ? 
                                    0.11439534f : 
                                    0.057373494f)))))) : 
             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[6])) ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.7457356f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3719134f ? 
                         (data[14 /* phishingTermsWeight */] <1.6339501f ? 
                            -0.05797678f : 
                             (data[14 /* phishingTermsWeight */] <2.0592575f ? 
                                0.13006198f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.6334226f ? 
                                    0.03414084f : 
                                    0.0946517f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.646351f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.4661818f ? 
                                -0.007458768f : 
                                -0.018218081f) : 
                             (data[14 /* phishingTermsWeight */] <3.8078473f ? 
                                0.117685124f : 
                                -0.014972699f))) : 
                    -0.12342222f) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3340588f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.1921797f ? 
                         (data[14 /* phishingTermsWeight */] <1.6749594f ? 
                            0.14543542f : 
                             (data[14 /* phishingTermsWeight */] <1.8949066f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8308668f ? 
                                    0.054301996f : 
                                    -0.14624514f) : 
                                 (data[14 /* phishingTermsWeight */] <2.1753395f ? 
                                    0.11964189f : 
                                    0.053093046f))) : 
                        -0.11551413f) : 
                     (data[14 /* phishingTermsWeight */] <3.5585756f ? 
                         (data[14 /* phishingTermsWeight */] <3.4668996f ? 
                            0.13083827f : 
                            0.16438825f) : 
                         (data[14 /* phishingTermsWeight */] <3.7795844f ? 
                            -0.0537f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.1172366f ? 
                                0.026345415f : 
                                0.059505053f)))))));
    return pred;
  } // constant pool size = 301B, number of visited nodes = 66, static init size = 210B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_34 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_34_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_34_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[6])) ? 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                -0.14049456f : 
                -0.059145577f) : 
            0.004754483f) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <6.0f ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[9])) ? 
                     (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[8])) ? 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[6])) ? 
                            0.022692f : 
                            0.06755999f) : 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[6])) ? 
                            -0.01615448f : 
                            0.14616811f)) : 
                     (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                         (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[8])) ? 
                            0.10527695f : 
                             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                                0.055183295f : 
                                0.11427594f)) : 
                        0.11155863f)) : 
                 (data[7 /* imagesAsURL */] <1.5f ? 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                        0.11107889f : 
                        0.13472292f) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <3.5f ? 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[9])) ? 
                            0.029231932f : 
                             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[6])) ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                    0.10853513f : 
                                    0.10479992f) : 
                                0.06923654f)) : 
                        0.02317285f))) : 
             (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <107.0f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <21.5f ? 
                         (data[7 /* imagesAsURL */] <8.5f ? 
                            -0.039463956f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <15.5f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                                    -0.12754324f : 
                                    -0.14671004f) : 
                                -0.08719765f)) : 
                         (data[7 /* imagesAsURL */] <42.0f ? 
                            -0.020957775f : 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[6])) ? 
                                -0.1168832f : 
                                -0.112558186f))) : 
                    -0.13804796f) : 
                 (data[7 /* imagesAsURL */] <21.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <15.0f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                            -0.028908622f : 
                            0.18821605f) : 
                        -0.071298845f) : 
                     (data[7 /* imagesAsURL */] <52.5f ? 
                        -0.12846512f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <112.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <83.5f ? 
                                 (data[7 /* imagesAsURL */] <78.0f ? 
                                    -0.10697908f : 
                                    -0.10501579f) : 
                                -0.10665627f) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <130.0f ? 
                                -0.108787104f : 
                                -0.106598474f)))))));
    return pred;
  } // constant pool size = 213B, number of visited nodes = 34, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_35 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_35_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_35_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <6.0f ? 
             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[11])) ? 
                    -0.11491742f : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[6])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                -0.060609978f : 
                                -0.10569497f) : 
                            0.007881665f) : 
                        -0.11112228f)) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[6])) ? 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[11])) ? 
                            0.014804412f : 
                            0.032180455f) : 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                            0.04520561f : 
                            0.11318385f)) : 
                     (data[7 /* imagesAsURL */] <1.5f ? 
                        0.12535493f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <3.5f ? 
                            0.044394504f : 
                            0.044198398f)))) : 
             (data[7 /* imagesAsURL */] <13.5f ? 
                 (data[7 /* imagesAsURL */] <9.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <7.5f ? 
                        -0.13640141f : 
                        -0.12842984f) : 
                     (data[7 /* imagesAsURL */] <10.5f ? 
                        -0.11214675f : 
                        -0.12182198f)) : 
                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[6])) ? 
                    -0.109167986f : 
                     (data[7 /* imagesAsURL */] <24.5f ? 
                        0.019036865f : 
                        -0.112377994f)))) : 
         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[0])) ? 
            -0.014769769f : 
             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[11])) ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                            0.10345494f : 
                            0.103139594f) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[8])) ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                    0.083044f : 
                                    0.10432585f) : 
                                0.104912646f) : 
                            0.10603857f)) : 
                    -0.02210537f) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[11])) ? 
                                0.10735766f : 
                                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[8])) ? 
                                    0.056858692f : 
                                    0.10889858f)) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                0.110612646f : 
                                0.10947511f)) : 
                        0.034540683f) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <16.5f ? 
                         (data[7 /* imagesAsURL */] <8.5f ? 
                            0.116780646f : 
                             (data[7 /* imagesAsURL */] <13.0f ? 
                                -0.14556366f : 
                                -0.027955238f)) : 
                        -0.09606336f)))));
    return pred;
  } // constant pool size = 216B, number of visited nodes = 36, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_36 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_36_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_36_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
            -0.1311004f : 
             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[6])) ? 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[9])) ? 
                    -0.13572788f : 
                    -0.05112772f) : 
                0.0041115256f)) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <18.5f ? 
             (data[3 /* domainsCount */] <1.5f ? 
                 (data[3 /* domainsCount */] <0.5f ? 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[6])) ? 
                        -0.020579953f : 
                        0.009158673f) : 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[6])) ? 
                             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[11])) ? 
                                0.0021538339f : 
                                0.021740869f) : 
                             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[11])) ? 
                                0.054113243f : 
                                0.10598232f)) : 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[11])) ? 
                            0.10500493f : 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                                0.11728889f : 
                                0.06862758f)))) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[6])) ? 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[11])) ? 
                             (data[3 /* domainsCount */] <2.5f ? 
                                0.10641092f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                    0.102802426f : 
                                    0.10319038f)) : 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[9])) ? 
                                0.058096807f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                                    0.10928685f : 
                                    0.1136475f))) : 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[9])) ? 
                             (data[3 /* domainsCount */] <2.5f ? 
                                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[11])) ? 
                                    0.012644636f : 
                                    0.09581067f) : 
                                 (data[3 /* domainsCount */] <3.5f ? 
                                    0.06099878f : 
                                    0.040296707f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    0.06367523f : 
                                    0.009195322f) : 
                                0.12846427f))) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <12.5f ? 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[9])) ? 
                            -0.087261744f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <10.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                                    0.03996526f : 
                                    0.042524815f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <11.5f ? 
                                    -0.006870231f : 
                                    -0.08268744f))) : 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[6])) ? 
                            -0.062274687f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <17.5f ? 
                                 (data[3 /* domainsCount */] <15.0f ? 
                                    0.07970256f : 
                                    0.09154166f) : 
                                0.10252269f))))) : 
             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[11])) ? 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[9])) ? 
                    -0.10192011f : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <23.5f ? 
                        -0.094349444f : 
                        0.10722045f)) : 
                0.14189248f)));
    return pred;
  } // constant pool size = 254B, number of visited nodes = 38, static init size = 600B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_37 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_37_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_37_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[12])) ? 
            -0.12511478f : 
             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[6])) ? 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                    -0.021909108f : 
                    -0.050352342f) : 
                0.021453112f)) : 
         (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[6])) ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[10])) ? 
                    -0.03180218f : 
                    0.031006943f) : 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[10])) ? 
                    9.706758E-4f : 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[12])) ? 
                        0.10375825f : 
                        0.1056803f))) : 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[12])) ? 
                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                    -0.023163212f : 
                    0.05729347f) : 
                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[6])) ? 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[10])) ? 
                        0.015157393f : 
                        0.072290316f) : 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[10])) ? 
                        -0.006754182f : 
                        0.056576747f)))));
    return pred;
  } // constant pool size = 128B, number of visited nodes = 14, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_38 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_38_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_38_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
         (data[3 /* domainsCount */] <0.5f ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                    -0.08064749f : 
                    -0.04151082f) : 
                0.078197666f) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                 (Double.isNaN(data[13 /* isSuspendTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[13]) || (GenModel.bitSetIsInRange(32, 0, data[13]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[13])) ? 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                            -0.029695652f : 
                            -0.020363118f) : 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[10])) ? 
                            -0.01309604f : 
                            0.0076229516f)) : 
                    0.071806714f) : 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[10])) ? 
                        -0.020600824f : 
                        0.020231731f) : 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[10])) ? 
                            -0.03434867f : 
                            0.009418203f) : 
                        0.14270692f)))) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <26.5f ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[15])) ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[10])) ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.0f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                    -0.014893212f : 
                                    -0.0698089f) : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                    -0.03466256f : 
                                    0.11714451f)) : 
                             (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                    -0.05860605f : 
                                    -0.007323247f) : 
                                 (data[3 /* domainsCount */] <8.0f ? 
                                    0.03244451f : 
                                    -0.052994374f))) : 
                         (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                             (data[3 /* domainsCount */] <19.0f ? 
                                -0.11045303f : 
                                -0.10446319f) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <16.5f ? 
                                0.077676415f : 
                                0.022031307f))) : 
                     (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.024500208f : 
                        0.05053119f)) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[10])) ? 
                            0.028484313f : 
                            0.10777537f) : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                                0.023560138f : 
                                0.025005696f) : 
                            0.13219808f)) : 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[10])) ? 
                        0.014728601f : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                    0.09037556f : 
                                    0.16768879f) : 
                                 (data[3 /* domainsCount */] <10.0f ? 
                                    0.11257669f : 
                                    0.05177888f)) : 
                            -0.014004776f)))) : 
             (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[1])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <45.5f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                         (data[3 /* domainsCount */] <39.5f ? 
                            -0.12420453f : 
                            -0.10956057f) : 
                        -0.10655344f) : 
                    -0.031183448f) : 
                0.10575699f)));
    return pred;
  } // constant pool size = 255B, number of visited nodes = 42, static init size = 510B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_39 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_39_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_39_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (data[3 /* domainsCount */] <0.5f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8373009f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.28128076f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.043950118f ? 
                            0.017605003f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.1338493f ? 
                                -0.10664271f : 
                                -0.109156504f)) : 
                         (data[14 /* phishingTermsWeight */] <0.39426583f ? 
                            0.19905666f : 
                             (data[14 /* phishingTermsWeight */] <0.76752007f ? 
                                0.070714466f : 
                                0.0481034f))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.92626584f ? 
                        -0.111594394f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.1801059f ? 
                            0.0905296f : 
                            -0.048631396f))) : 
                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[9])) ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    -0.05544001f : 
                                    -0.027010625f) : 
                                 (data[14 /* phishingTermsWeight */] <0.1468144f ? 
                                    -0.13730794f : 
                                    0.1211414f)) : 
                            0.047622684f) : 
                        0.10681722f) : 
                    0.036432758f)) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.944625f ? 
                     (data[14 /* phishingTermsWeight */] <0.1771172f ? 
                         (data[3 /* domainsCount */] <5.5f ? 
                            -0.10472151f : 
                            -0.115995035f) : 
                         (data[14 /* phishingTermsWeight */] <0.85144114f ? 
                            0.09631598f : 
                            0.0329415f)) : 
                    -0.0672206f) : 
                 (data[14 /* phishingTermsWeight */] <0.5422847f ? 
                    0.13604344f : 
                     (data[14 /* phishingTermsWeight */] <1.0333595f ? 
                        -0.122989915f : 
                         (data[3 /* domainsCount */] <9.5f ? 
                            0.15039329f : 
                            0.060972057f))))) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[6])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                                -0.061972976f : 
                                 (data[14 /* phishingTermsWeight */] <3.0639987f ? 
                                    0.09074864f : 
                                    0.058009323f)) : 
                             (data[14 /* phishingTermsWeight */] <3.0639987f ? 
                                 (data[14 /* phishingTermsWeight */] <2.0447607f ? 
                                    0.11780595f : 
                                    0.113182686f) : 
                                 (data[14 /* phishingTermsWeight */] <3.3055356f ? 
                                    0.11396977f : 
                                    0.058280453f))) : 
                         (data[14 /* phishingTermsWeight */] <3.2113042f ? 
                            -0.118131496f : 
                             (data[14 /* phishingTermsWeight */] <4.553176f ? 
                                 (data[14 /* phishingTermsWeight */] <3.6714928f ? 
                                    0.10540505f : 
                                    0.11135181f) : 
                                 (data[14 /* phishingTermsWeight */] <5.4142103f ? 
                                    -0.14728963f : 
                                    0.10326907f)))) : 
                     (data[14 /* phishingTermsWeight */] <3.7023222f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.9587681f ? 
                            0.111701556f : 
                            0.11996377f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.263664f ? 
                            0.1030451f : 
                            0.102747075f))) : 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                     (data[14 /* phishingTermsWeight */] <2.2292678f ? 
                        -0.11692742f : 
                         (data[14 /* phishingTermsWeight */] <3.4351087f ? 
                             (data[14 /* phishingTermsWeight */] <2.5794194f ? 
                                0.12403433f : 
                                0.089132115f) : 
                             (data[14 /* phishingTermsWeight */] <4.7012415f ? 
                                -0.120675296f : 
                                 (data[14 /* phishingTermsWeight */] <6.053291f ? 
                                    0.106577046f : 
                                    0.107057415f)))) : 
                     (data[14 /* phishingTermsWeight */] <2.1065135f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8122596f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                 (data[14 /* phishingTermsWeight */] <1.6577762f ? 
                                    0.17581584f : 
                                    0.028524974f) : 
                                0.110006414f) : 
                             (data[3 /* domainsCount */] <1.5f ? 
                                 (data[14 /* phishingTermsWeight */] <1.8968143f ? 
                                    -0.09440506f : 
                                    0.13197514f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    -0.09670199f : 
                                    -0.0922272f))) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                             (data[14 /* phishingTermsWeight */] <3.3535068f ? 
                                 (data[3 /* domainsCount */] <1.5f ? 
                                    0.03266275f : 
                                    -0.011294226f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    0.104967736f : 
                                    0.11700626f)) : 
                             (data[3 /* domainsCount */] <0.5f ? 
                                -0.047795065f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    0.09108664f : 
                                    0.027661528f)))))) : 
             (data[14 /* phishingTermsWeight */] <2.2292678f ? 
                 (data[14 /* phishingTermsWeight */] <1.816022f ? 
                    0.023671353f : 
                    0.12265807f) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.816961f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.033507f ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.634482f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.1797988f ? 
                                    -0.02791981f : 
                                    -0.099889055f) : 
                                 (data[14 /* phishingTermsWeight */] <3.9786315f ? 
                                    0.052270316f : 
                                    -0.02486152f)) : 
                            0.03624583f) : 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[10])) ? 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[6])) ? 
                                -0.13786562f : 
                                -0.11586474f) : 
                            -0.034073602f)) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <7.61059f ? 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[10])) ? 
                                0.10539321f : 
                                0.109219f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.3153896f ? 
                                0.105993904f : 
                                0.11074285f)) : 
                         (data[14 /* phishingTermsWeight */] <8.235342f ? 
                            0.10344318f : 
                            0.10275485f))))));
    return pred;
  } // constant pool size = 361B, number of visited nodes = 76, static init size = 330B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_40 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_40_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_40_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[11])) ? 
         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                -0.13034527f : 
                -0.041133694f) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[9])) ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                0.014891815f : 
                                0.016854135f) : 
                            0.05696577f) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                            0.10338091f : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <3.5f ? 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                                    0.12714942f : 
                                    0.12691557f) : 
                                0.1173513f))) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.5f ? 
                         (data[7 /* imagesAsURL */] <1.5f ? 
                            0.10947208f : 
                             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                                0.026364572f : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                    0.066325806f : 
                                    0.03547264f))) : 
                         (data[2 /* hexadecimalURLs */] <9.5f ? 
                            -0.020223571f : 
                            -0.11015012f))) : 
                 (data[7 /* imagesAsURL */] <31.5f ? 
                     (data[7 /* imagesAsURL */] <12.5f ? 
                         (data[7 /* imagesAsURL */] <8.5f ? 
                            0.017623333f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <10.5f ? 
                                 (data[7 /* imagesAsURL */] <9.5f ? 
                                    -0.13080692f : 
                                    -0.111470625f) : 
                                -0.12919739f)) : 
                         (data[7 /* imagesAsURL */] <15.5f ? 
                            0.06315187f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <19.0f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <16.5f ? 
                                    -0.047184307f : 
                                    -0.122317195f) : 
                                0.024434252f))) : 
                     (data[7 /* imagesAsURL */] <51.5f ? 
                        -0.12653038f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <133.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <113.5f ? 
                                 (data[7 /* imagesAsURL */] <70.5f ? 
                                    -0.11275641f : 
                                    -0.10711921f) : 
                                 (data[7 /* imagesAsURL */] <116.0f ? 
                                    -0.13794778f : 
                                    -0.10827414f)) : 
                            -0.1057479f))))) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <6.0f ? 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[0])) ? 
                -0.12706043f : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                        0.10385771f : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                            0.06387421f : 
                            0.10455831f)) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                        0.114021026f : 
                        0.10614687f))) : 
            -0.004194634f));
    return pred;
  } // constant pool size = 182B, number of visited nodes = 35, static init size = 240B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_41 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_41_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_41_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[11])) ? 
            -0.109702274f : 
             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[6])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8863148f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.27697337f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.13848668f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.10732718f ? 
                                    -0.02647705f : 
                                    -0.05023266f) : 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                                    -0.03620176f : 
                                    0.0965541f)) : 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                 (data[14 /* phishingTermsWeight */] <0.7148104f ? 
                                    0.039476503f : 
                                    -0.03418332f) : 
                                 (data[14 /* phishingTermsWeight */] <0.33736467f ? 
                                    0.17397329f : 
                                    0.074642286f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.127534f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0096784f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9270391f ? 
                                    -0.062637985f : 
                                    -0.031493243f) : 
                                 (data[14 /* phishingTermsWeight */] <1.0824049f ? 
                                    -0.14112402f : 
                                    -0.040570486f)) : 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                                 (data[14 /* phishingTermsWeight */] <1.3291245f ? 
                                    -0.06704104f : 
                                    -0.080718994f) : 
                                 (data[14 /* phishingTermsWeight */] <1.2205757f ? 
                                    0.18693344f : 
                                    0.031911727f)))) : 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                        -0.085141204f : 
                        0.057336576f)) : 
                 (data[14 /* phishingTermsWeight */] <0.60642594f ? 
                    -0.12987998f : 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                        -0.02261202f : 
                        0.1961747f)))) : 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9171426f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5094767f ? 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[15])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.4203908f ? 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                             (data[14 /* phishingTermsWeight */] <1.924079f ? 
                                -0.074582845f : 
                                0.11326179f) : 
                             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[11])) ? 
                                0.046468798f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.3301523f ? 
                                    0.037311994f : 
                                    0.120020874f))) : 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[10])) ? 
                            -0.08217066f : 
                             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[6])) ? 
                                 (data[14 /* phishingTermsWeight */] <2.5829556f ? 
                                    -0.11894203f : 
                                    0.002160683f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3686845f ? 
                                    0.09025437f : 
                                    -0.058583617f)))) : 
                     (data[14 /* phishingTermsWeight */] <1.6580309f ? 
                        0.20173866f : 
                         (data[14 /* phishingTermsWeight */] <1.9677157f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8087407f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7794749f ? 
                                    -0.018044181f : 
                                    0.07785792f) : 
                                -0.050017823f) : 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[6])) ? 
                                 (data[14 /* phishingTermsWeight */] <2.0423217f ? 
                                    0.13032071f : 
                                    0.06554673f) : 
                                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[11])) ? 
                                    -0.0012921488f : 
                                    0.08160474f))))) : 
                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[6])) ? 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[11])) ? 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[15])) ? 
                            0.10159568f : 
                            0.10194718f) : 
                         (data[14 /* phishingTermsWeight */] <3.6529105f ? 
                            -0.0059714047f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8031168f ? 
                                0.11049379f : 
                                0.03893339f))) : 
                     (data[14 /* phishingTermsWeight */] <3.542347f ? 
                        0.15003565f : 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[10])) ? 
                            -0.03242642f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.6996758f ? 
                                0.045291804f : 
                                0.13045654f))))) : 
             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[11])) ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.8692274f ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT20, 32, 0, data[15])) ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT21, 32, 0, data[10])) ? 
                             (data[14 /* phishingTermsWeight */] <4.952397f ? 
                                -0.111214295f : 
                                -0.055263426f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.4349394f ? 
                                 (data[14 /* phishingTermsWeight */] <4.013852f ? 
                                    -0.09335471f : 
                                    0.08296743f) : 
                                -0.10366549f)) : 
                         (data[14 /* phishingTermsWeight */] <4.1803293f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.1260433f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9998283f ? 
                                    0.07474322f : 
                                    -0.051334437f) : 
                                0.14861521f) : 
                             (data[14 /* phishingTermsWeight */] <4.6572556f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.570126f ? 
                                    -0.017466826f : 
                                    -0.102119796f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.1023865f ? 
                                    0.051824458f : 
                                    -0.03203213f)))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.7670884f ? 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT22, 32, 0, data[6])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.248675f ? 
                                0.10304809f : 
                                0.10769814f) : 
                            0.106104046f) : 
                         (data[14 /* phishingTermsWeight */] <7.044864f ? 
                            0.1024722f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <7.5965576f ? 
                                0.1050869f : 
                                0.10245807f)))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.7419176f ? 
                     (data[14 /* phishingTermsWeight */] <4.5184193f ? 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT23, 32, 0, data[6])) ? 
                             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT24, 32, 0, data[10])) ? 
                                0.10330762f : 
                                0.10565786f) : 
                            0.10538445f) : 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT25, 32, 0, data[6])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.419771f ? 
                                0.1033022f : 
                                0.10264501f) : 
                             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT26, 32, 0, data[10])) ? 
                                0.10291755f : 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT27, 32, 0, data[15])) ? 
                                    0.10579044f : 
                                    0.120545305f)))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.953682f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.3333907f ? 
                             (data[14 /* phishingTermsWeight */] <5.8526645f ? 
                                0.10210215f : 
                                0.10301765f) : 
                            0.102098554f) : 
                         (data[14 /* phishingTermsWeight */] <7.5899463f ? 
                            0.11094079f : 
                            0.10271023f))))));
    return pred;
  } // constant pool size = 458B, number of visited nodes = 79, static init size = 840B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT20 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT21 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT22 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT23 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT24 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT25 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT26 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT27 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_42 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_42_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_42_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[10])) ? 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
                        -0.027191903f : 
                         (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[8])) ? 
                            0.02403315f : 
                            0.10409324f)) : 
                    0.05762663f) : 
                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[11])) ? 
                    0.079534605f : 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                        0.10505306f : 
                         (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[8])) ? 
                            0.12704508f : 
                            0.09810274f)))) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <13.5f ? 
                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[10])) ? 
                         (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[8])) ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    -0.023254465f : 
                                    -0.02666594f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                                    -0.0574513f : 
                                    0.01580555f)) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                0.05777114f : 
                                0.029070852f)) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                            7.21869E-4f : 
                             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                                0.022663565f : 
                                0.022898072f))) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[10])) ? 
                                0.10208727f : 
                                0.049605075f) : 
                             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[10])) ? 
                                0.104542926f : 
                                0.09986594f)) : 
                        -0.073618755f)) : 
                -0.14401871f)) : 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                0.0790926f : 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[10])) ? 
                    -0.06995499f : 
                    0.11754782f)) : 
             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[10])) ? 
                -0.18644737f : 
                -0.05275547f)));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_43 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_43_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_43_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (data[3 /* domainsCount */] <0.5f ? 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
                    -0.013145486f : 
                    0.09877967f) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                        -0.10137694f : 
                        -0.047014672f) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                            -0.11227141f : 
                            -0.105425686f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                -0.10654618f : 
                                -0.10844251f) : 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                                -0.10599384f : 
                                -0.104974724f))))) : 
            -0.10762342f) : 
         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <28.5f ? 
                 (data[3 /* domainsCount */] <1.5f ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                         (data[3 /* domainsCount */] <0.5f ? 
                            -0.07491707f : 
                            3.0536047E-4f) : 
                         (data[3 /* domainsCount */] <0.5f ? 
                            0.025133261f : 
                             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[8])) ? 
                                0.012347807f : 
                                0.10392886f))) : 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[15])) ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[8])) ? 
                                    0.01042467f : 
                                    0.10964367f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                                    0.03266688f : 
                                    0.032104466f)) : 
                             (data[3 /* domainsCount */] <7.5f ? 
                                 (data[3 /* domainsCount */] <6.5f ? 
                                    -0.061625946f : 
                                    -0.021417955f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                                    -0.0025116452f : 
                                    0.05041105f))) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <13.5f ? 
                             (data[3 /* domainsCount */] <2.5f ? 
                                0.038413495f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                    0.051442403f : 
                                    0.08884917f)) : 
                            -0.027493648f))) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <46.0f ? 
                     (data[3 /* domainsCount */] <32.5f ? 
                        -0.12268787f : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <40.5f ? 
                            -0.10406868f : 
                            -0.107651584f)) : 
                    -0.015656834f)) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[15])) ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    -0.01220755f : 
                                    0.10486481f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    0.11641123f : 
                                    0.030871753f)) : 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[15])) ? 
                                0.10782945f : 
                                0.12020398f)) : 
                        -0.052491996f) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                        0.12835526f : 
                        -0.014022857f)) : 
                 (data[3 /* domainsCount */] <12.5f ? 
                    -0.05932672f : 
                     (data[3 /* domainsCount */] <18.5f ? 
                        0.10689196f : 
                         (data[3 /* domainsCount */] <22.0f ? 
                            -0.09579499f : 
                            0.10418132f))))));
    return pred;
  } // constant pool size = 243B, number of visited nodes = 44, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_44 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_44_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_44_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
                 (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[5])) ? 
                    -0.029660048f : 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[12])) ? 
                        -0.10664374f : 
                        -0.025823094f)) : 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[12])) ? 
                    -0.14655298f : 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[5])) ? 
                        0.0626645f : 
                        0.096325226f))) : 
             (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[5])) ? 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                    0.071290545f : 
                    0.13944994f) : 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                    0.05694518f : 
                    0.1255318f))) : 
         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[5])) ? 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[12])) ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[15])) ? 
                    -0.10910821f : 
                    -0.10829097f) : 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[15])) ? 
                     (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.039543197f : 
                        -0.037091516f) : 
                    -4.9391267E-4f)) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                     (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.027535236f : 
                         (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[12])) ? 
                             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[8])) ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[15])) ? 
                                    0.03728879f : 
                                    0.050049823f) : 
                                0.10650141f) : 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[15])) ? 
                                -0.038773347f : 
                                0.11231976f))) : 
                     (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[12])) ? 
                         (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[8])) ? 
                             (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT20, 32, 0, data[1])) ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT21, 32, 0, data[15])) ? 
                                    -0.027616907f : 
                                    -0.013523315f) : 
                                 (data[4 /* dotsCount */] <3.5f ? 
                                    0.015148258f : 
                                    0.10338612f)) : 
                            0.037958372f) : 
                        0.11154408f)) : 
                -0.039723672f)));
    return pred;
  } // constant pool size = 220B, number of visited nodes = 27, static init size = 660B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT20 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT21 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_45 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_45_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_45_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (data[3 /* domainsCount */] <0.5f ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                    0.034467105f : 
                    0.0677742f) : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                    -0.13072485f : 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                            -0.11666731f : 
                            -0.108446054f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[11])) ? 
                                -0.105505355f : 
                                -0.071959436f) : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    -0.108479016f : 
                                    -0.105527356f) : 
                                -0.110891685f))))) : 
            -0.10660537f) : 
         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <11.5f ? 
             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <18.5f ? 
                     (data[3 /* domainsCount */] <1.5f ? 
                         (data[3 /* domainsCount */] <0.5f ? 
                            -0.02435665f : 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                                    0.0027067773f : 
                                    0.03539644f) : 
                                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[11])) ? 
                                    0.10316558f : 
                                    0.06632849f))) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                             (data[3 /* domainsCount */] <2.5f ? 
                                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[11])) ? 
                                    0.019262725f : 
                                    0.08617661f) : 
                                 (data[3 /* domainsCount */] <3.5f ? 
                                    0.04994217f : 
                                    0.027566588f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <17.5f ? 
                                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[10])) ? 
                                    -0.04744781f : 
                                    -0.019168027f) : 
                                0.08116371f))) : 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[10])) ? 
                         (data[3 /* domainsCount */] <36.5f ? 
                            -0.10482188f : 
                            -0.04391885f) : 
                        0.041621298f)) : 
                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[11])) ? 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[10])) ? 
                        -0.033171006f : 
                        0.10323154f) : 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                         (data[3 /* domainsCount */] <2.5f ? 
                            0.05898316f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                                 (data[3 /* domainsCount */] <3.5f ? 
                                    -0.13685942f : 
                                    0.06365755f) : 
                                 (data[3 /* domainsCount */] <14.5f ? 
                                    0.12301476f : 
                                    0.0014184301f))) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <3.5f ? 
                                0.12268123f : 
                                0.10699737f) : 
                            0.07719794f)))) : 
            -0.10761949f));
    return pred;
  } // constant pool size = 211B, number of visited nodes = 36, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_46 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_46_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_46_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.12828241f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.042092666f ? 
                            -0.013997594f : 
                            -0.10188361f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0733353f ? 
                             (data[14 /* phishingTermsWeight */] <0.8292069f ? 
                                 (data[14 /* phishingTermsWeight */] <0.29822755f ? 
                                    -0.10736011f : 
                                    -0.112776f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9665317f ? 
                                    -0.1053632f : 
                                    -0.10314106f)) : 
                            0.029692704f)) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.944625f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8560664f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.1070083f ? 
                                0.01706819f : 
                                0.08295655f) : 
                            -0.049662597f) : 
                        0.15665898f)) : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.85132873f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.19953017f ? 
                            0.055294223f : 
                             (data[14 /* phishingTermsWeight */] <0.5584824f ? 
                                0.18684795f : 
                                0.09514492f)) : 
                        -0.104000114f) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.85132873f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.026604023f ? 
                            0.106367484f : 
                            0.07164481f) : 
                        0.14834045f))) : 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4256841f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.1249539f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8630194f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.47466066f ? 
                                    -0.055583484f : 
                                    0.036556866f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0133518f ? 
                                    -0.06887924f : 
                                    -0.06899563f)) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
                                    0.021553516f : 
                                    0.12233206f) : 
                                -0.05605447f)) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8437154f ? 
                            0.08443914f : 
                            -0.120828256f)) : 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                         (data[14 /* phishingTermsWeight */] <1.2883931f ? 
                            -0.11170029f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3964446f ? 
                                -0.07239042f : 
                                0.15470624f)) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                             (data[14 /* phishingTermsWeight */] <1.2266494f ? 
                                0.12178793f : 
                                 (data[14 /* phishingTermsWeight */] <1.3305241f ? 
                                    -0.13536677f : 
                                    0.02768051f)) : 
                            -0.10997773f))) : 
                -0.14976738f)) : 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9171426f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.446849f ? 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                         (data[4 /* dotsCount */] <1.5f ? 
                             (data[14 /* phishingTermsWeight */] <1.950554f ? 
                                0.10353565f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.6954987f ? 
                                    0.034239486f : 
                                    0.12440356f)) : 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.0559556f ? 
                                    0.016391098f : 
                                    -0.08997968f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.09625354f : 
                                    -0.039055727f))) : 
                         (data[4 /* dotsCount */] <0.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.4500692f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.9120291f ? 
                                    -0.07102021f : 
                                    -0.021207184f) : 
                                0.09660668f) : 
                             (data[14 /* phishingTermsWeight */] <1.7426593f ? 
                                 (data[14 /* phishingTermsWeight */] <1.5917451f ? 
                                    0.1112089f : 
                                    0.21082465f) : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                    0.07801426f : 
                                    -0.030930368f)))) : 
                     (data[14 /* phishingTermsWeight */] <3.5442185f ? 
                         (data[14 /* phishingTermsWeight */] <3.5178483f ? 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                                0.016714571f : 
                                0.10897066f) : 
                            0.13245405f) : 
                         (data[14 /* phishingTermsWeight */] <3.6746242f ? 
                            -0.018184433f : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8333104f ? 
                                    0.108007856f : 
                                    0.10350244f) : 
                                0.107661024f)))) : 
                 (data[14 /* phishingTermsWeight */] <1.95385f ? 
                    -0.1023627f : 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                        -0.10436454f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.7883291f ? 
                            0.044579547f : 
                            -0.10444657f)))) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (data[14 /* phishingTermsWeight */] <4.023589f ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                         (data[14 /* phishingTermsWeight */] <3.9430206f ? 
                            0.10290756f : 
                            -0.070194505f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9879277f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9512756f ? 
                                0.039080516f : 
                                0.10919762f) : 
                            -0.07529237f)) : 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[10])) ? 
                         (data[14 /* phishingTermsWeight */] <4.1710515f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.082964f ? 
                                0.110580616f : 
                                0.14115424f) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (data[14 /* phishingTermsWeight */] <4.7296042f ? 
                                    0.0043125213f : 
                                    0.08052982f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.939802f ? 
                                    -0.05685397f : 
                                    0.10767078f))) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[9])) ? 
                             (data[14 /* phishingTermsWeight */] <4.731408f ? 
                                -0.038285837f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <7.53909f ? 
                                    0.10429602f : 
                                    0.10165989f)) : 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[15])) ? 
                                 (data[14 /* phishingTermsWeight */] <4.9673476f ? 
                                    -0.04653111f : 
                                    0.10616341f) : 
                                 (data[14 /* phishingTermsWeight */] <4.4954686f ? 
                                    0.11442871f : 
                                    0.10472374f))))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.9466653f ? 
                     (data[14 /* phishingTermsWeight */] <5.0200453f ? 
                        0.050456915f : 
                        -0.094578f) : 
                     (data[14 /* phishingTermsWeight */] <7.3554573f ? 
                        0.10308199f : 
                        0.10223896f)))));
    return pred;
  } // constant pool size = 381B, number of visited nodes = 81, static init size = 330B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_47 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_47_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_47_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
                -0.0034861856f : 
                0.029880581f) : 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                -0.055331428f : 
                 (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[8])) ? 
                    0.12223103f : 
                    0.12711202f))) : 
         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                -0.09348011f : 
                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[8])) ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <6.5f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                 (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                                    -0.007606467f : 
                                    0.007826492f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                                    -0.0425946f : 
                                    0.051531438f)) : 
                            -0.080517896f) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                0.07849277f : 
                                0.048765168f) : 
                            -0.06111604f)) : 
                    0.039049067f)) : 
             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <11.0f ? 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <4.5f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                        0.11817322f : 
                        -0.04301174f) : 
                    0.09196929f) : 
                -0.106507175f)));
    return pred;
  } // constant pool size = 104B, number of visited nodes = 18, static init size = 180B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_48 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_48_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_48_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[9])) ? 
            -0.12381413f : 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                 (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[5])) ? 
                    -0.030955182f : 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[12])) ? 
                        -0.1024798f : 
                        -0.035899747f)) : 
                -0.030910224f)) : 
         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[12])) ? 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                    -0.047264483f : 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[5])) ? 
                        -0.107313715f : 
                        0.11158282f)) : 
                0.10253994f) : 
             (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[5])) ? 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[9])) ? 
                    0.006618485f : 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[15])) ? 
                        0.0056301095f : 
                        0.051409993f)) : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[9])) ? 
                     (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[8])) ? 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[15])) ? 
                            0.01401534f : 
                            0.10345618f) : 
                        0.102559194f) : 
                     (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[8])) ? 
                        0.04428876f : 
                        0.085360035f)))));
    return pred;
  } // constant pool size = 146B, number of visited nodes = 16, static init size = 480B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_49 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_49_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_49_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                    -0.045757f : 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                        -0.04747471f : 
                        -0.0073689977f)) : 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                    -0.014788768f : 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                        0.113219656f : 
                        0.10209782f))) : 
             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[10])) ? 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[0])) ? 
                    0.04649211f : 
                     (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[8])) ? 
                         (data[4 /* dotsCount */] <0.5f ? 
                            0.10268247f : 
                            0.10192451f) : 
                         (data[4 /* dotsCount */] <0.5f ? 
                            0.02959394f : 
                             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[9])) ? 
                                0.1023193f : 
                                0.13561875f)))) : 
                0.15039174f)) : 
         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[0])) ? 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[9])) ? 
                -0.12152273f : 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[10])) ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[15])) ? 
                        -0.116409466f : 
                        -0.10793529f) : 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[15])) ? 
                        -0.100917004f : 
                        -0.067495465f))) : 
             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[10])) ? 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[15])) ? 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[9])) ? 
                         (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[8])) ? 
                            -0.012774953f : 
                            0.037364226f) : 
                        0.034305613f) : 
                    0.015037363f) : 
                0.035332516f)));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 22, static init size = 540B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_50 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_50_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_50_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[12])) ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3877467f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.65388435f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.18120563f ? 
                            -0.10535832f : 
                            -0.110782415f) : 
                        -0.10249248f) : 
                    -0.14743121f) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7269737f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.84999484f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.23906104f ? 
                            0.019067517f : 
                             (data[14 /* phishingTermsWeight */] <0.54635864f ? 
                                0.14914273f : 
                                 (data[14 /* phishingTermsWeight */] <0.7852127f ? 
                                    0.085360005f : 
                                    -0.0093834875f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.2754129f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0706117f ? 
                                -0.10998381f : 
                                0.018743426f) : 
                            -0.1159304f)) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.6463382f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.3647177f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7761306f ? 
                                0.056308214f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.1558309f ? 
                                    0.0125908675f : 
                                    0.040274747f)) : 
                            0.19483179f) : 
                         (data[14 /* phishingTermsWeight */] <3.206576f ? 
                            -0.08796775f : 
                             (data[14 /* phishingTermsWeight */] <4.0857186f ? 
                                -0.005710096f : 
                                 (data[14 /* phishingTermsWeight */] <4.9428825f ? 
                                    0.10868846f : 
                                    0.10447627f)))))) : 
             (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[5])) ? 
                 (data[14 /* phishingTermsWeight */] <2.1278782f ? 
                    0.17096984f : 
                     (data[14 /* phishingTermsWeight */] <2.9388428f ? 
                        -0.09226883f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.1070466f ? 
                             (data[14 /* phishingTermsWeight */] <3.920747f ? 
                                 (data[14 /* phishingTermsWeight */] <3.1685255f ? 
                                    0.10382877f : 
                                    0.103367135f) : 
                                 (data[14 /* phishingTermsWeight */] <4.207181f ? 
                                    0.10824807f : 
                                    0.10341904f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.8039694f ? 
                                 (data[14 /* phishingTermsWeight */] <5.2628922f ? 
                                    0.10150633f : 
                                    0.1014796f) : 
                                 (data[14 /* phishingTermsWeight */] <6.2221227f ? 
                                    0.10088153f : 
                                    0.1011766f))))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9560033f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.5750957f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.026957612f ? 
                            0.046254866f : 
                            0.08808346f) : 
                         (data[14 /* phishingTermsWeight */] <0.8466804f ? 
                            0.010045405f : 
                            -0.0153688695f)) : 
                     (data[14 /* phishingTermsWeight */] <1.9698541f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.35677f ? 
                            0.1435624f : 
                            0.09692652f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3275568f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.6263309f ? 
                                0.10880022f : 
                                0.12012177f) : 
                            0.105414316f))))) : 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.771203f ? 
             (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[5])) ? 
                -0.10590894f : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4944526f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0277008f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                                    -0.04759022f : 
                                    0.01999155f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4240997f ? 
                                    -0.028665956f : 
                                    -0.14794262f)) : 
                             (data[14 /* phishingTermsWeight */] <0.1468144f ? 
                                -0.09467992f : 
                                 (data[14 /* phishingTermsWeight */] <0.82853186f ? 
                                    0.13353421f : 
                                    0.093329474f))) : 
                         (data[14 /* phishingTermsWeight */] <0.61937326f ? 
                            0.12304782f : 
                            0.011227513f)) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.694932f ? 
                         (data[14 /* phishingTermsWeight */] <1.5511793f ? 
                            0.015956588f : 
                             (data[4 /* dotsCount */] <2.5f ? 
                                0.12418732f : 
                                0.16746496f)) : 
                        -0.040017262f))) : 
             (data[14 /* phishingTermsWeight */] <1.8008039f ? 
                0.087616615f : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <8.5f ? 
                     (data[14 /* phishingTermsWeight */] <1.9187449f ? 
                        -0.05778787f : 
                         (data[14 /* phishingTermsWeight */] <2.1509414f ? 
                             (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[5])) ? 
                                -0.06415118f : 
                                 (data[4 /* dotsCount */] <2.5f ? 
                                    0.04435288f : 
                                    0.13708597f)) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[5])) ? 
                                    0.06443897f : 
                                    0.044904537f) : 
                                 (data[14 /* phishingTermsWeight */] <2.510846f ? 
                                    -0.058598522f : 
                                    0.017168857f)))) : 
                    -0.11753054f))));
    return pred;
  } // constant pool size = 271B, number of visited nodes = 61, static init size = 150B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_51 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_51_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_51_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[11])) ? 
            -0.10717423f : 
             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[6])) ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                    -0.018117871f : 
                     (data[14 /* phishingTermsWeight */] <0.60642594f ? 
                        -0.12819372f : 
                         (data[14 /* phishingTermsWeight */] <1.074179f ? 
                            0.14660461f : 
                            -0.009250984f))) : 
                0.014902107f)) : 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9171426f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3079867f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.210097f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.1043413f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.0547683f ? 
                             (data[14 /* phishingTermsWeight */] <1.9021963f ? 
                                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[11])) ? 
                                    0.0059119184f : 
                                    0.101847224f) : 
                                 (data[14 /* phishingTermsWeight */] <2.0153008f ? 
                                    0.12541547f : 
                                    0.041841265f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.0941412f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.078662f ? 
                                    -0.023861423f : 
                                    -0.15574908f) : 
                                0.10999468f)) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.1305988f ? 
                            0.14991026f : 
                            0.11104767f)) : 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[6])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.2816122f ? 
                            -0.11265051f : 
                            -0.13793255f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.296828f ? 
                            0.10226793f : 
                            0.11341167f))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5452287f ? 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[6])) ? 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                            1.2668391E-4f : 
                            0.10095313f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5125742f ? 
                             (data[14 /* phishingTermsWeight */] <3.3529303f ? 
                                0.095327325f : 
                                 (data[14 /* phishingTermsWeight */] <3.3831754f ? 
                                    0.11552502f : 
                                    0.03707619f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.520769f ? 
                                0.13732183f : 
                                0.16031852f))) : 
                     (data[14 /* phishingTermsWeight */] <3.6752555f ? 
                         (data[14 /* phishingTermsWeight */] <3.6160212f ? 
                            -0.073038295f : 
                            2.7894703E-4f) : 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[6])) ? 
                             (data[14 /* phishingTermsWeight */] <3.8052824f ? 
                                0.10704578f : 
                                0.03313151f) : 
                            0.113860324f)))) : 
             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[11])) ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.8692274f ? 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                         (data[14 /* phishingTermsWeight */] <4.059694f ? 
                             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[10])) ? 
                                -0.08312747f : 
                                -0.055542126f) : 
                             (data[14 /* phishingTermsWeight */] <4.230456f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.1287475f ? 
                                    0.09224252f : 
                                    0.14060025f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.1525702f ? 
                                    -6.540389E-4f : 
                                    -0.05022357f))) : 
                         (data[14 /* phishingTermsWeight */] <4.331124f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.2135043f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.00767f ? 
                                    0.10271203f : 
                                    0.107783586f) : 
                                0.08106243f) : 
                             (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[8])) ? 
                                -0.12318287f : 
                                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[10])) ? 
                                    -0.021193305f : 
                                    -0.012840612f)))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.7670884f ? 
                         (data[14 /* phishingTermsWeight */] <6.1938424f ? 
                            0.10218787f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.2927456f ? 
                                0.103431575f : 
                                0.10571268f)) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <7.6930075f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <7.0379453f ? 
                                0.1016723f : 
                                0.10310973f) : 
                            0.10140247f))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.7419176f ? 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[6])) ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[10])) ? 
                            0.10199393f : 
                             (data[14 /* phishingTermsWeight */] <4.481855f ? 
                                0.10587474f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.3555713f ? 
                                    0.10282408f : 
                                    0.101897515f))) : 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[10])) ? 
                            0.1021884f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.066884f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.688627f ? 
                                    0.10421165f : 
                                    0.10288798f) : 
                                0.11118549f))) : 
                     (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[8])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <7.2636685f ? 
                             (data[14 /* phishingTermsWeight */] <6.0532875f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.8112116f ? 
                                    0.101262294f : 
                                    0.10177865f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.752828f ? 
                                    0.101067044f : 
                                    0.10145273f)) : 
                             (data[14 /* phishingTermsWeight */] <7.889277f ? 
                                0.10212278f : 
                                0.1015956f)) : 
                        0.10613847f)))));
    return pred;
  } // constant pool size = 339B, number of visited nodes = 63, static init size = 510B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_52 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_52_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_52_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3]) || data[3 /* domainsCount */] <28.5f ? 
         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[12])) ? 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                        -0.11468132f : 
                        -0.0904716f) : 
                    0.07848436f) : 
                 (data[3 /* domainsCount */] <1.5f ? 
                    -0.09136011f : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                            0.03154503f : 
                            0.04668783f) : 
                         (data[3 /* domainsCount */] <8.5f ? 
                            -0.08178437f : 
                            0.033428982f)))) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                 (data[3 /* domainsCount */] <0.5f ? 
                    0.010077789f : 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[8])) ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                                    -0.0197721f : 
                                    -0.009596203f) : 
                                0.11281853f) : 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[8])) ? 
                                    -0.010585547f : 
                                    0.029562684f) : 
                                0.013583073f)) : 
                         (data[2 /* hexadecimalURLs */] <1.5f ? 
                            0.076926254f : 
                            -0.016914524f))) : 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                     (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[8])) ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <5.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                                    -0.009323139f : 
                                    -0.034558613f) : 
                                 (data[3 /* domainsCount */] <4.5f ? 
                                    0.01044452f : 
                                    0.07570546f)) : 
                            0.026790414f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                             (data[3 /* domainsCount */] <4.0f ? 
                                0.019841423f : 
                                0.0661536f) : 
                            -0.014792606f)) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.0f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    0.029946348f : 
                                    0.021655953f) : 
                                0.11604968f) : 
                            0.0035331766f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                                    0.11685626f : 
                                    0.033097614f) : 
                                0.14691995f) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <13.5f ? 
                                 (data[3 /* domainsCount */] <9.5f ? 
                                    -0.018366108f : 
                                    0.058526233f) : 
                                -0.032151558f)))))) : 
         (data[3 /* domainsCount */] <38.5f ? 
             (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[12])) ? 
                -0.11557664f : 
                0.059942935f) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <48.5f ? 
                 (data[3 /* domainsCount */] <40.5f ? 
                    -0.10399545f : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <42.5f ? 
                        -0.107554466f : 
                        -0.10675097f)) : 
                -0.018985143f)));
    return pred;
  } // constant pool size = 207B, number of visited nodes = 40, static init size = 270B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_53 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_53_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_53_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3]) || data[3 /* domainsCount */] <28.5f ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[12])) ? 
                -0.11799645f : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                            0.00788327f : 
                            0.04548222f) : 
                         (data[4 /* dotsCount */] <0.5f ? 
                            0.28022903f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                                    0.10246595f : 
                                    0.076825626f) : 
                                -0.008758198f))) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.0f ? 
                        0.12036304f : 
                        0.11288139f))) : 
             (data[3 /* domainsCount */] <1.5f ? 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                    -0.031019937f : 
                    -0.036338054f) : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <15.5f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    6.196424E-4f : 
                                    0.015267763f) : 
                                 (data[3 /* domainsCount */] <2.5f ? 
                                    0.102967925f : 
                                    0.07238658f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <19.0f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                    0.025296405f : 
                                    0.078931846f) : 
                                -0.10372943f)) : 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[10])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                                    -0.029554311f : 
                                    0.06711622f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                    -0.032642387f : 
                                    -0.0646262f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                 (data[3 /* domainsCount */] <2.5f ? 
                                    -0.05216126f : 
                                    0.09689312f) : 
                                 (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[12])) ? 
                                    -0.044824984f : 
                                    0.12248241f)))) : 
                    -0.1294877f))) : 
         (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[12])) ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <47.5f ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                     (data[3 /* domainsCount */] <39.5f ? 
                        -0.11616398f : 
                        -0.10678164f) : 
                    -0.103598855f) : 
                -0.02320986f) : 
            -0.013012937f));
    return pred;
  } // constant pool size = 166B, number of visited nodes = 31, static init size = 240B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_54 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_54_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_54_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <18.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[9])) ? 
                                -0.06659266f : 
                                 (data[3 /* domainsCount */] <0.5f ? 
                                    -0.03547879f : 
                                    -0.01758128f)) : 
                            0.0027142458f) : 
                         (data[3 /* domainsCount */] <0.5f ? 
                            0.037076935f : 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[12])) ? 
                                    -0.04377681f : 
                                    -0.015765782f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    0.112540804f : 
                                    -0.010340946f)))) : 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    0.0011052652f : 
                                    -0.020535529f) : 
                                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                                    -0.03621625f : 
                                    0.004150665f)) : 
                            0.045863762f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    0.021249907f : 
                                    0.022802457f) : 
                                -0.0012802165f) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                    0.07390348f : 
                                    0.14384037f) : 
                                 (data[3 /* domainsCount */] <10.0f ? 
                                    -0.035146084f : 
                                    0.054639965f))))) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <45.5f ? 
                     (data[3 /* domainsCount */] <29.5f ? 
                        -0.11047313f : 
                         (data[3 /* domainsCount */] <39.5f ? 
                            -0.102769814f : 
                            -0.10479424f)) : 
                    -0.0018543827f)) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[15])) ? 
                     (data[3 /* domainsCount */] <0.5f ? 
                        -0.06626322f : 
                         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[12])) ? 
                            -0.04660464f : 
                             (data[3 /* domainsCount */] <1.5f ? 
                                0.04829152f : 
                                 (data[3 /* domainsCount */] <2.5f ? 
                                    -0.041427515f : 
                                    0.0594627f)))) : 
                     (data[3 /* domainsCount */] <1.5f ? 
                        0.10860397f : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                             (data[3 /* domainsCount */] <2.5f ? 
                                -0.0051998612f : 
                                 (data[3 /* domainsCount */] <3.5f ? 
                                    0.05636195f : 
                                    -0.0063415654f)) : 
                             (data[3 /* domainsCount */] <7.5f ? 
                                0.09869217f : 
                                0.10729253f)))) : 
                 (data[3 /* domainsCount */] <13.0f ? 
                    -0.061482288f : 
                     (data[3 /* domainsCount */] <28.5f ? 
                        0.113703534f : 
                        -0.06031996f)))) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <14.5f ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[15])) ? 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[9])) ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[10])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                -0.13507977f : 
                                0.10738399f) : 
                             (data[3 /* domainsCount */] <0.5f ? 
                                -0.026532829f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    0.04653932f : 
                                    -0.008335528f))) : 
                         (data[3 /* domainsCount */] <3.5f ? 
                            -0.119651034f : 
                             (data[3 /* domainsCount */] <4.5f ? 
                                0.115608744f : 
                                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[10])) ? 
                                    -0.032840572f : 
                                    0.10284374f)))) : 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[12])) ? 
                        0.10173793f : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.0f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                0.115016766f : 
                                0.10883371f) : 
                            0.109721705f))) : 
                 (data[3 /* domainsCount */] <1.5f ? 
                     (data[3 /* domainsCount */] <0.5f ? 
                        0.014115411f : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[9])) ? 
                            0.103847325f : 
                            0.062808275f)) : 
                     (data[3 /* domainsCount */] <2.5f ? 
                        0.11221217f : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                             (data[3 /* domainsCount */] <3.5f ? 
                                0.105498806f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                    0.10618353f : 
                                    0.10868349f)) : 
                            0.10254007f)))) : 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[9])) ? 
                -0.07719917f : 
                0.101725146f)));
    return pred;
  } // constant pool size = 331B, number of visited nodes = 61, static init size = 510B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_55 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_55_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_55_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8571243f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.042856216f ? 
                                -0.06902059f : 
                                -0.11546504f) : 
                            -0.01497909f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.12543283f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.043901492f ? 
                                0.015857859f : 
                                -0.10080679f) : 
                             (data[14 /* phishingTermsWeight */] <0.847957f ? 
                                 (data[14 /* phishingTermsWeight */] <0.3015088f ? 
                                    -0.102518775f : 
                                    -0.10819546f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9322515f ? 
                                    -0.10207055f : 
                                    -0.030542467f)))) : 
                     (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8571243f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                -0.10723304f : 
                                -0.109089576f) : 
                            0.06930148f) : 
                         (data[14 /* phishingTermsWeight */] <0.08362188f ? 
                            0.21515422f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9616517f ? 
                                0.010529501f : 
                                0.13823704f)))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.85132873f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.19287917f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                                0.0044598947f : 
                                0.049211144f) : 
                             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                                -0.10728315f : 
                                0.18618134f)) : 
                         (data[14 /* phishingTermsWeight */] <0.5520414f ? 
                            0.15552324f : 
                            0.06089246f)) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[0])) ? 
                            -0.09711383f : 
                            -0.106648244f) : 
                        0.116065495f))) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[0])) ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9542936f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                                    -0.06600844f : 
                                    -0.11588684f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.2886773f ? 
                                    -0.11156137f : 
                                    -0.056877833f)) : 
                            0.20741495f) : 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                 (data[14 /* phishingTermsWeight */] <1.284626f ? 
                                    -0.10190581f : 
                                    -0.10107213f) : 
                                -0.10116105f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.1378115f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.14222644f ? 
                                    -0.04014815f : 
                                    -0.101913884f) : 
                                0.09233552f))) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[15])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[0])) ? 
                                    -0.045332294f : 
                                    -0.102144614f) : 
                                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[0])) ? 
                                    -0.10217079f : 
                                    0.14124031f)) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9542936f ? 
                                    -0.009576241f : 
                                    0.09058826f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    -0.04202772f : 
                                    -0.115723215f))) : 
                         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[0])) ? 
                             (data[14 /* phishingTermsWeight */] <0.8441828f ? 
                                -0.10327168f : 
                                -0.10200216f) : 
                            0.121664524f))) : 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[15])) ? 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[0])) ? 
                         (data[14 /* phishingTermsWeight */] <0.458795f ? 
                            -0.10280853f : 
                            -0.10530746f) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <5.5f ? 
                             (data[3 /* domainsCount */] <8.0f ? 
                                -0.0056714686f : 
                                0.13107286f) : 
                            -0.11349683f)) : 
                    0.1317719f))) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[0])) ? 
                     (data[4 /* dotsCount */] <1.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.8132792f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.3126774f ? 
                                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[15])) ? 
                                    -0.01768768f : 
                                    0.07608426f) : 
                                0.10654685f) : 
                            -0.07187439f) : 
                         (data[14 /* phishingTermsWeight */] <1.7172784f ? 
                            0.065228425f : 
                             (data[14 /* phishingTermsWeight */] <1.8639629f ? 
                                 (data[14 /* phishingTermsWeight */] <1.7540631f ? 
                                    -0.12709734f : 
                                    -0.10672648f) : 
                                 (data[14 /* phishingTermsWeight */] <2.0033133f ? 
                                    -0.10246256f : 
                                    -0.10073848f)))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8096433f ? 
                         (data[3 /* domainsCount */] <0.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.0879502f ? 
                                -0.0052941362f : 
                                -0.12401739f) : 
                             (data[14 /* phishingTermsWeight */] <1.9739612f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.043324884f : 
                                    -0.091443345f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                    0.09657301f : 
                                    -0.03385415f))) : 
                         (data[3 /* domainsCount */] <0.5f ? 
                            -0.045130916f : 
                             (data[14 /* phishingTermsWeight */] <4.2573404f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.12599f ? 
                                    0.07908332f : 
                                    0.13424289f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    0.10612714f : 
                                    0.041612614f))))) : 
                -0.13175176f) : 
             (data[14 /* phishingTermsWeight */] <2.2215743f ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[15])) ? 
                     (data[14 /* phishingTermsWeight */] <1.931186f ? 
                        -0.006882314f : 
                        0.124675125f) : 
                     (data[14 /* phishingTermsWeight */] <2.069466f ? 
                        0.06394766f : 
                        0.11470355f)) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[0])) ? 
                        -0.104684874f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                                 (data[14 /* phishingTermsWeight */] <2.8429363f ? 
                                    0.12313882f : 
                                    0.05556893f) : 
                                -0.14336693f) : 
                             (data[14 /* phishingTermsWeight */] <3.6470656f ? 
                                 (data[14 /* phishingTermsWeight */] <2.9778674f ? 
                                    0.04937752f : 
                                    -0.16733548f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <23.5f ? 
                                    0.104547635f : 
                                    -0.05191504f)))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.008035f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.064891f ? 
                             (data[4 /* dotsCount */] <2.5f ? 
                                 (data[14 /* phishingTermsWeight */] <3.1613574f ? 
                                    -0.10721761f : 
                                    -0.10359001f) : 
                                 (data[7 /* imagesAsURL */] <51.5f ? 
                                    -0.0885303f : 
                                    -0.10708965f)) : 
                            -0.13512534f) : 
                         (data[14 /* phishingTermsWeight */] <7.62633f ? 
                            0.10694101f : 
                            0.10170264f))))));
    return pred;
  } // constant pool size = 456B, number of visited nodes = 91, static init size = 540B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_56 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_56_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_56_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[9])) ? 
                -0.08073456f : 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[6])) ? 
                        0.0047361995f : 
                        0.010991462f) : 
                    0.032228913f)) : 
             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[6])) ? 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                    0.10043445f : 
                    0.11458664f) : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                    0.109236434f : 
                    0.052107655f))) : 
         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[6])) ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[10])) ? 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[9])) ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                -0.014628452f : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <3.5f ? 
                                    0.07927226f : 
                                    0.06360476f)) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.04194519f : 
                                    0.08979751f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                    0.0496698f : 
                                    0.0311158f))) : 
                        0.0031124589f) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.0f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[9])) ? 
                                0.005169299f : 
                                0.10260127f) : 
                            0.05476828f) : 
                        -0.02447314f)) : 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[10])) ? 
                     (data[7 /* imagesAsURL */] <15.0f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                             (data[7 /* imagesAsURL */] <5.5f ? 
                                0.014837161f : 
                                 (data[4 /* dotsCount */] <2.5f ? 
                                    -0.12327062f : 
                                    -0.09932036f)) : 
                            0.0053339885f) : 
                         (data[7 /* imagesAsURL */] <46.5f ? 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[9])) ? 
                                 (data[4 /* dotsCount */] <2.5f ? 
                                    -0.13747276f : 
                                    -0.09558162f) : 
                                -0.10278175f) : 
                             (data[7 /* imagesAsURL */] <55.5f ? 
                                -0.103235774f : 
                                 (data[4 /* dotsCount */] <2.5f ? 
                                    -0.109192125f : 
                                    -0.10553421f)))) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <15.0f ? 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[9])) ? 
                            0.102516964f : 
                            0.06688855f) : 
                        -0.07760754f))) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <38.0f ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <7.5f ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[10])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    -0.08089294f : 
                                    0.10275909f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.10160631f : 
                                    0.10267832f)) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.045662582f : 
                                    0.029818786f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                    0.10819923f : 
                                    0.10202806f))) : 
                        -0.04171779f) : 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[9])) ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                                -0.091122165f : 
                                -0.085392654f) : 
                            -0.018965526f) : 
                        0.11450528f)) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <96.5f ? 
                     (data[7 /* imagesAsURL */] <73.5f ? 
                        -0.106165305f : 
                        -0.10683817f) : 
                    -0.1359154f))));
    return pred;
  } // constant pool size = 269B, number of visited nodes = 48, static init size = 450B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_57 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_57_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_57_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[12])) ? 
                    -0.12596314f : 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                        0.0050780876f : 
                        0.03791764f)) : 
                 (data[3 /* domainsCount */] <1.5f ? 
                    0.25583977f : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                        0.14557134f : 
                        0.10941242f))) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                        0.10188905f : 
                         (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[8])) ? 
                            0.11466887f : 
                            0.059427757f)) : 
                    -0.012482133f) : 
                0.07756067f)) : 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <38.5f ? 
                 (data[3 /* domainsCount */] <1.5f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                            -0.1175158f : 
                             (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[12])) ? 
                                -0.034857363f : 
                                -0.05791973f)) : 
                        0.09947122f) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[8])) ? 
                                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[10])) ? 
                                    0.007957977f : 
                                    0.052146494f) : 
                                0.027468426f) : 
                             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[10])) ? 
                                0.1037941f : 
                                0.06269211f)) : 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[10])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <16.5f ? 
                                 (data[3 /* domainsCount */] <2.5f ? 
                                    -0.006174741f : 
                                    -0.039084412f) : 
                                -0.11194732f) : 
                             (data[3 /* domainsCount */] <3.5f ? 
                                -0.004697485f : 
                                 (data[3 /* domainsCount */] <8.5f ? 
                                    0.09991042f : 
                                    -0.0011585525f))))) : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                    -0.10469998f : 
                    -0.010574718f)) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <15.5f ? 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                         (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[12])) ? 
                             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[10])) ? 
                                -0.08138928f : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                                    -0.0376538f : 
                                    -0.05965001f)) : 
                            0.0018922223f) : 
                         (data[4 /* dotsCount */] <6.5f ? 
                            0.043477826f : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <7.5f ? 
                                -0.09301933f : 
                                0.036552254f))) : 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[10])) ? 
                        -0.17384067f : 
                        -0.06022684f)) : 
                -0.12053748f)));
    return pred;
  } // constant pool size = 215B, number of visited nodes = 37, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_58 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_58_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_58_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
         (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[8])) ? 
             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                -0.0039271736f : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[9])) ? 
                    0.017160013f : 
                    0.02164468f)) : 
             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                -0.023264779f : 
                0.09271004f)) : 
         (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[8])) ? 
            -0.054920197f : 
             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[10])) ? 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                    -0.023902725f : 
                    0.10140668f) : 
                0.027891321f)));
    return pred;
  } // constant pool size = 74B, number of visited nodes = 8, static init size = 240B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_59 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_59_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_59_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
            -0.1305747f : 
            -0.027893085f) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <6.0f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (data[4 /* dotsCount */] <0.5f ? 
                     (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[11])) ? 
                         (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[8])) ? 
                            -0.010385842f : 
                            0.101716414f) : 
                        0.12210878f) : 
                     (data[4 /* dotsCount */] <1.5f ? 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[11])) ? 
                            0.10129233f : 
                             (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[8])) ? 
                                0.11195537f : 
                                0.10261017f)) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                                    0.009993633f : 
                                    0.055841267f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.11257375f : 
                                    0.10304988f)) : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                 (data[7 /* imagesAsURL */] <1.5f ? 
                                    0.08348136f : 
                                    0.06228021f) : 
                                0.0048130546f)))) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                            -0.04715914f : 
                            -0.047426853f) : 
                         (data[4 /* dotsCount */] <6.5f ? 
                            0.022133276f : 
                            -0.06524054f)) : 
                    0.06763866f)) : 
             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[11])) ? 
                 (data[7 /* imagesAsURL */] <13.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                         (data[4 /* dotsCount */] <2.5f ? 
                            -0.12174373f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                                0.027294701f : 
                                -0.11393015f)) : 
                        -0.11986079f) : 
                     (data[7 /* imagesAsURL */] <35.0f ? 
                         (data[4 /* dotsCount */] <2.5f ? 
                            -0.11374841f : 
                             (data[7 /* imagesAsURL */] <16.5f ? 
                                0.11108062f : 
                                -0.08376712f)) : 
                         (data[7 /* imagesAsURL */] <63.5f ? 
                             (data[7 /* imagesAsURL */] <49.5f ? 
                                -0.11915175f : 
                                -0.10950894f) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <112.0f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <95.5f ? 
                                    -0.10535702f : 
                                    -0.10319611f) : 
                                 (data[7 /* imagesAsURL */] <117.5f ? 
                                    -0.11927583f : 
                                    -0.1058854f))))) : 
                -0.025366368f)));
    return pred;
  } // constant pool size = 174B, number of visited nodes = 33, static init size = 240B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_60 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_60_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_60_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                    -0.034185234f : 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[12])) ? 
                        -0.10432002f : 
                        -0.018188959f)) : 
                0.027881982f) : 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[12])) ? 
                -0.12030833f : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                    0.038475893f : 
                     (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[8])) ? 
                        0.10082287f : 
                        0.07171857f)))) : 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[10])) ? 
                     (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[8])) ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                                -0.043415513f : 
                                -0.018383227f) : 
                             (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                                -0.049136177f : 
                                0.008812497f)) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                            0.030579792f : 
                            0.03390511f)) : 
                     (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[12])) ? 
                         (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                            -0.010555987f : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                -0.0021871412f : 
                                0.036474355f)) : 
                        0.08001103f)) : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[12])) ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[10])) ? 
                            -0.044188377f : 
                            -0.08236914f) : 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[10])) ? 
                            -0.009025097f : 
                            0.0073522404f)) : 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[10])) ? 
                        0.017212005f : 
                        0.050103948f))) : 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[15])) ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[10])) ? 
                    -0.049478404f : 
                    -0.04639428f) : 
                 (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[1])) ? 
                    -0.023316639f : 
                    0.10190345f))));
    return pred;
  } // constant pool size = 205B, number of visited nodes = 27, static init size = 570B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_61 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_61_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_61_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                -0.1153691f : 
                -0.029471101f) : 
             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <10.5f ? 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                     (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[8])) ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                            0.0069208303f : 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                                0.017182207f : 
                                0.10421544f)) : 
                        0.07189264f) : 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <4.0f ? 
                        0.0503821f : 
                        0.10673161f)) : 
                -0.10595805f)) : 
         (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[8])) ? 
            -0.05115806f : 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[0])) ? 
                    0.024079537f : 
                    0.007815435f) : 
                0.108553894f)));
    return pred;
  } // constant pool size = 90B, number of visited nodes = 12, static init size = 240B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_62 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_62_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_62_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.0f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4251319f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.81277055f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.1269954f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.066672586f ? 
                                -0.01506372f : 
                                -0.11622374f) : 
                             (data[14 /* phishingTermsWeight */] <0.32823196f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.28287756f ? 
                                    0.0068496405f : 
                                    0.13873796f) : 
                                 (data[14 /* phishingTermsWeight */] <0.46909755f ? 
                                    -0.013388343f : 
                                    0.019433238f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.1235594f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0065455f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9275613f ? 
                                    -0.06325951f : 
                                    -0.039010983f) : 
                                -0.11682874f) : 
                             (data[14 /* phishingTermsWeight */] <1.1892488f ? 
                                0.10061942f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3985428f ? 
                                    -0.01669405f : 
                                    0.11340941f)))) : 
                     (data[14 /* phishingTermsWeight */] <0.06680306f ? 
                        -0.11426281f : 
                         (data[14 /* phishingTermsWeight */] <0.9940408f ? 
                            0.21407682f : 
                            0.050204154f))) : 
                -0.14027345f) : 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8573732f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.117218986f ? 
                    0.13171995f : 
                    0.14544323f) : 
                 (data[7 /* imagesAsURL */] <29.0f ? 
                    -0.0661155f : 
                    -0.103440545f))) : 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9171426f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3079867f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                         (data[14 /* phishingTermsWeight */] <1.9094529f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8311634f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7841897f ? 
                                    0.012946763f : 
                                    0.07521128f) : 
                                -0.06880767f) : 
                             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[9])) ? 
                                 (data[14 /* phishingTermsWeight */] <2.2589595f ? 
                                    -0.25237125f : 
                                    0.062379587f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.5385647f ? 
                                    0.06255186f : 
                                    0.050567057f))) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.0390582f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                    -0.09558602f : 
                                    0.11089963f) : 
                                -0.10334462f) : 
                            -0.106840864f)) : 
                     (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[1])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.971953f ? 
                             (data[7 /* imagesAsURL */] <18.5f ? 
                                -0.12940912f : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <89.5f ? 
                                    -0.10445445f : 
                                    -0.10695731f)) : 
                            -0.11057531f) : 
                         (data[7 /* imagesAsURL */] <51.5f ? 
                            0.094022825f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.1732688f ? 
                                 (data[7 /* imagesAsURL */] <112.5f ? 
                                    -0.103314966f : 
                                    -0.1064002f) : 
                                -0.10136327f)))) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5436938f ? 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                            0.10683704f : 
                             (data[14 /* phishingTermsWeight */] <3.4687245f ? 
                                 (data[14 /* phishingTermsWeight */] <3.398657f ? 
                                    0.09928284f : 
                                    0.047125123f) : 
                                 (data[14 /* phishingTermsWeight */] <3.516073f ? 
                                    0.1430594f : 
                                    0.13164668f))) : 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                            -0.06855859f : 
                             (data[14 /* phishingTermsWeight */] <3.7439508f ? 
                                0.09882782f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8549628f ? 
                                    0.10426747f : 
                                    0.12472889f)))) : 
                     (data[7 /* imagesAsURL */] <67.5f ? 
                        -0.072963126f : 
                        -0.105052486f))) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                 (data[14 /* phishingTermsWeight */] <4.0444527f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9695237f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                            0.061166212f : 
                            0.10352108f) : 
                         (data[14 /* phishingTermsWeight */] <3.9835055f ? 
                            -0.10121916f : 
                            -0.004357728f)) : 
                     (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[8])) ? 
                         (data[14 /* phishingTermsWeight */] <4.977596f ? 
                            -0.13130888f : 
                             (data[14 /* phishingTermsWeight */] <5.248257f ? 
                                0.10411961f : 
                                 (data[14 /* phishingTermsWeight */] <5.7963467f ? 
                                    0.10116969f : 
                                    0.10189323f))) : 
                         (data[14 /* phishingTermsWeight */] <4.1777587f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.127708f ? 
                                 (data[14 /* phishingTermsWeight */] <4.063893f ? 
                                    0.10540577f : 
                                    0.10624813f) : 
                                0.13193598f) : 
                             (data[14 /* phishingTermsWeight */] <4.5910077f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.3863134f ? 
                                    0.103205755f : 
                                    -0.024949566f) : 
                                 (data[14 /* phishingTermsWeight */] <5.148894f ? 
                                    0.07430089f : 
                                    0.0501397f))))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.038974f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.08996f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.6246567f ? 
                             (data[14 /* phishingTermsWeight */] <4.2846274f ? 
                                -0.106475815f : 
                                -0.087579735f) : 
                            -0.10226712f) : 
                        -0.124559f) : 
                    0.10567705f))));
    return pred;
  } // constant pool size = 303B, number of visited nodes = 69, static init size = 150B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_63 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_63_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_63_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.81488484f ? 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.28648296f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.026857778f ? 
                            -0.021716172f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.1356859f ? 
                                -0.10312711f : 
                                -0.102102265f)) : 
                         (data[14 /* phishingTermsWeight */] <0.67794776f ? 
                            -0.1073904f : 
                            -0.10600522f)) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.35651213f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.105839536f ? 
                            -0.005159781f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.23959455f ? 
                                -0.06407395f : 
                                -0.03451389f)) : 
                         (data[14 /* phishingTermsWeight */] <0.7839942f ? 
                            0.13336277f : 
                            -0.0077782143f))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.10504375f ? 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.024619628f ? 
                            -0.021162044f : 
                            0.030877216f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.042674024f ? 
                            -0.010479297f : 
                            -0.10219467f)) : 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                         (data[14 /* phishingTermsWeight */] <0.38646945f ? 
                            0.12379777f : 
                             (data[14 /* phishingTermsWeight */] <0.4790152f ? 
                                -0.10662886f : 
                                0.03283774f)) : 
                        0.06412934f))) : 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                 (data[14 /* phishingTermsWeight */] <0.9884068f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9063814f ? 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                            -0.04895817f : 
                            -0.03845134f) : 
                        -0.12711139f) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3482097f ? 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[6])) ? 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                                -0.09539549f : 
                                -0.0049981712f) : 
                             (data[14 /* phishingTermsWeight */] <1.0607777f ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[15])) ? 
                                    -0.018966496f : 
                                    -0.009570525f) : 
                                 (data[14 /* phishingTermsWeight */] <1.1716467f ? 
                                    0.11591688f : 
                                    0.012808439f))) : 
                        -0.068650305f)) : 
                 (data[14 /* phishingTermsWeight */] <1.1899985f ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[15])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.94320416f ? 
                            -0.10341617f : 
                            -0.103448756f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0329475f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.96832156f ? 
                                -0.10206626f : 
                                 (data[14 /* phishingTermsWeight */] <0.98737484f ? 
                                    -0.10089769f : 
                                    -0.10160761f)) : 
                            -0.10283308f)) : 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[15])) ? 
                            -0.10552458f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3499322f ? 
                                -0.10116756f : 
                                -0.10645734f)) : 
                        0.074521534f)))) : 
         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[5])) ? 
             (data[14 /* phishingTermsWeight */] <2.0604804f ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[15])) ? 
                    -0.02210269f : 
                     (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[0])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7697873f ? 
                            -0.011084399f : 
                            0.11406637f) : 
                        0.054474436f)) : 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[0])) ? 
                     (data[14 /* phishingTermsWeight */] <2.6298983f ? 
                        -0.09294938f : 
                         (data[14 /* phishingTermsWeight */] <3.3246415f ? 
                            -0.0036179477f : 
                            -0.02708768f)) : 
                     (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[8])) ? 
                         (data[14 /* phishingTermsWeight */] <2.2882476f ? 
                            -0.046246056f : 
                             (data[14 /* phishingTermsWeight */] <2.6412866f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.5378203f ? 
                                    0.10504804f : 
                                    0.10912353f) : 
                                 (data[14 /* phishingTermsWeight */] <2.9766738f ? 
                                    -0.01551251f : 
                                    0.039710496f))) : 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[6])) ? 
                             (data[14 /* phishingTermsWeight */] <5.3403277f ? 
                                0.10336009f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.395075f ? 
                                    0.10172702f : 
                                    0.10270257f)) : 
                             (data[14 /* phishingTermsWeight */] <4.2470455f ? 
                                0.10448293f : 
                                 (data[14 /* phishingTermsWeight */] <5.2183356f ? 
                                    0.01526489f : 
                                    0.10465289f)))))) : 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[0])) ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.0885496f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.3990352f ? 
                         (data[14 /* phishingTermsWeight */] <1.6609446f ? 
                            0.07254639f : 
                             (data[14 /* phishingTermsWeight */] <1.7600024f ? 
                                -0.11936868f : 
                                 (data[14 /* phishingTermsWeight */] <2.0546992f ? 
                                    0.019166544f : 
                                    -0.12562062f))) : 
                        0.07512344f) : 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[6])) ? 
                        -0.15447728f : 
                        -0.10480367f)) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.7457356f ? 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT20, 32, 0, data[6])) ? 
                         (data[14 /* phishingTermsWeight */] <1.7197387f ? 
                            -0.0895209f : 
                             (data[14 /* phishingTermsWeight */] <2.3203893f ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT21, 32, 0, data[15])) ? 
                                    0.107489035f : 
                                    0.10938221f) : 
                                 (data[14 /* phishingTermsWeight */] <2.5606496f ? 
                                    -0.19870825f : 
                                    0.06337277f))) : 
                         (data[14 /* phishingTermsWeight */] <1.6188722f ? 
                            0.14402215f : 
                             (data[14 /* phishingTermsWeight */] <1.9989231f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8243077f ? 
                                    0.04507099f : 
                                    -0.06596893f) : 
                                 (data[14 /* phishingTermsWeight */] <2.1319408f ? 
                                    0.14114961f : 
                                    0.043009296f)))) : 
                    -0.10726349f))));
    return pred;
  } // constant pool size = 404B, number of visited nodes = 73, static init size = 660B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT20 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT21 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_64 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_64_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_64_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.5520852f ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0670586f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8269704f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.24809112f ? 
                                    -0.024443144f : 
                                    0.082987346f) : 
                                -0.11066105f) : 
                            0.016609054f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.6790373f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.2716149f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.04753261f ? 
                                    0.038374178f : 
                                    -0.10163655f) : 
                                0.074757375f) : 
                             (data[14 /* phishingTermsWeight */] <0.84238046f ? 
                                -0.007305135f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0873952f ? 
                                    -0.10340375f : 
                                    -0.026354603f)))) : 
                    0.20580806f) : 
                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.84879655f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.042439826f ? 
                                -0.10676406f : 
                                -0.10920349f) : 
                            0.031977847f) : 
                        -0.1070976f) : 
                     (data[14 /* phishingTermsWeight */] <0.09700532f ? 
                        0.14325078f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.94634604f ? 
                            0.021160835f : 
                            0.12992956f)))) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.1129675f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    -0.05525867f : 
                                    -0.022249762f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    -0.07131951f : 
                                    -0.10154152f)) : 
                             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.7348338f ? 
                                    -0.1025502f : 
                                    -0.10166294f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.843698f ? 
                                    0.06481833f : 
                                    -0.01881726f))) : 
                         (data[14 /* phishingTermsWeight */] <1.2218448f ? 
                             (data[3 /* domainsCount */] <1.5f ? 
                                0.1117239f : 
                                0.058936954f) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                                    -0.059271168f : 
                                    -0.101095185f) : 
                                 (data[3 /* domainsCount */] <2.5f ? 
                                    0.11733014f : 
                                    -0.024907177f)))) : 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[0])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.45970395f ? 
                             (data[3 /* domainsCount */] <5.5f ? 
                                -0.10180615f : 
                                -0.10260826f) : 
                            -0.10444316f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.0f ? 
                             (data[3 /* domainsCount */] <5.5f ? 
                                0.06631635f : 
                                0.12963764f) : 
                            0.09375605f))) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8536184f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.7469161f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.11203742f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    -0.03735442f : 
                                    0.067423485f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    -0.044605125f : 
                                    -0.07581303f)) : 
                            0.12096072f) : 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[0])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                 (data[3 /* domainsCount */] <1.5f ? 
                                    -0.14798357f : 
                                    -0.035164762f) : 
                                 (data[14 /* phishingTermsWeight */] <1.3040166f ? 
                                    -0.14042768f : 
                                    -0.13170983f)) : 
                             (data[14 /* phishingTermsWeight */] <1.277058f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.96849895f ? 
                                    -0.10281416f : 
                                    -0.17121668f) : 
                                 (data[3 /* domainsCount */] <2.5f ? 
                                    -0.10137007f : 
                                    -0.10136646f)))) : 
                    0.08922478f))) : 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[0])) ? 
                 (data[4 /* dotsCount */] <1.5f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.8312845f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.4250278f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7913556f ? 
                                0.040808935f : 
                                -0.005349671f) : 
                            0.08567444f) : 
                        -0.058065522f) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                         (data[14 /* phishingTermsWeight */] <1.815097f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7522507f ? 
                                -0.12092619f : 
                                -0.10425699f) : 
                             (data[3 /* domainsCount */] <1.5f ? 
                                 (data[14 /* phishingTermsWeight */] <2.1457064f ? 
                                    -0.1583929f : 
                                    -0.0019094298f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.399446f ? 
                                    -0.10861237f : 
                                    -0.12319838f))) : 
                         (data[14 /* phishingTermsWeight */] <2.1932132f ? 
                            0.11437252f : 
                             (data[14 /* phishingTermsWeight */] <2.5004327f ? 
                                -0.10479839f : 
                                -0.110162154f)))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.92906f ? 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[6])) ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                             (data[3 /* domainsCount */] <1.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <1.5f ? 
                                    0.1042992f : 
                                    -0.06767116f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.2349722f ? 
                                    0.106714234f : 
                                    0.07305162f)) : 
                             (data[3 /* domainsCount */] <6.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    0.1056847f : 
                                    0.10576327f) : 
                                 (data[14 /* phishingTermsWeight */] <3.2144043f ? 
                                    0.03680967f : 
                                    -0.10481707f))) : 
                         (data[4 /* dotsCount */] <0.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.2665296f ? 
                                 (data[14 /* phishingTermsWeight */] <1.7692038f ? 
                                    0.009031161f : 
                                    -2.8448E-4f) : 
                                -0.13600102f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3352993f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.068107f ? 
                                    0.05166362f : 
                                    -0.013811218f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5301328f ? 
                                    0.10756381f : 
                                    0.091542915f)))) : 
                     (data[14 /* phishingTermsWeight */] <4.004268f ? 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                -0.020227397f : 
                                -0.185949f) : 
                             (data[3 /* domainsCount */] <2.5f ? 
                                0.101716824f : 
                                0.10168489f)) : 
                         (data[14 /* phishingTermsWeight */] <4.152334f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.086277f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.066093f ? 
                                    0.026214635f : 
                                    0.105828315f) : 
                                0.12022828f) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                                    0.05343797f : 
                                    0.10551685f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.9883533f ? 
                                    -0.057110243f : 
                                    0.103601545f)))))) : 
             (data[14 /* phishingTermsWeight */] <2.4827194f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.1562223f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                        -0.007211679f : 
                        -0.0760246f) : 
                    -0.13265213f) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.969518f ? 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[0])) ? 
                        -0.10716903f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.005792f ? 
                             (data[14 /* phishingTermsWeight */] <3.4049358f ? 
                                -0.038346034f : 
                                0.08345366f) : 
                            -0.06547705f)) : 
                     (data[14 /* phishingTermsWeight */] <7.3688474f ? 
                        0.1018629f : 
                        0.101127684f)))));
    return pred;
  } // constant pool size = 458B, number of visited nodes = 99, static init size = 360B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_65 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_65_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_65_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.0f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4251319f ? 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8550792f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.47029355f ? 
                                    -0.01175247f : 
                                    0.030013042f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3314475f ? 
                                    -0.043979995f : 
                                    0.021795116f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.35628298f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.28502637f ? 
                                    -0.012013355f : 
                                    0.06983036f) : 
                                 (data[14 /* phishingTermsWeight */] <0.48868668f ? 
                                    -0.10718682f : 
                                    -0.046031766f))) : 
                         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                             (data[14 /* phishingTermsWeight */] <0.46316788f ? 
                                -0.104881465f : 
                                -0.10094329f) : 
                            0.13144584f)) : 
                     (data[14 /* phishingTermsWeight */] <0.10020459f ? 
                        -0.07351873f : 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                            -0.10467877f : 
                            0.10785575f))) : 
                -0.13058177f) : 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8573732f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.117218986f ? 
                    0.12596755f : 
                    0.14125456f) : 
                 (data[7 /* imagesAsURL */] <29.0f ? 
                    -0.06641526f : 
                    -0.103506684f))) : 
         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
             (data[14 /* phishingTermsWeight */] <2.0144475f ? 
                 (data[14 /* phishingTermsWeight */] <1.6661471f ? 
                    0.06216039f : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7529328f ? 
                        0.010288026f : 
                         (data[14 /* phishingTermsWeight */] <1.8583329f ? 
                            -0.10631689f : 
                            0.060301986f))) : 
                 (data[14 /* phishingTermsWeight */] <2.1318111f ? 
                    -0.13343477f : 
                     (data[14 /* phishingTermsWeight */] <2.5297472f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.3204277f ? 
                            -0.071099244f : 
                            0.1531712f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.301806f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5103147f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.0749943f ? 
                                    -0.04310129f : 
                                    -0.107465506f) : 
                                0.057136063f) : 
                            -0.12807448f)))) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.7816613f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                         (data[14 /* phishingTermsWeight */] <1.9397507f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8132272f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.783705f ? 
                                    0.0075255004f : 
                                    0.06443889f) : 
                                -0.049119543f) : 
                             (data[14 /* phishingTermsWeight */] <2.3966413f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.317867f ? 
                                    0.061749697f : 
                                    0.107510105f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.424645f ? 
                                    0.073755935f : 
                                    0.119632535f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.204986f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                -0.059044003f : 
                                0.1100114f) : 
                            -0.10436227f)) : 
                     (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[8])) ? 
                         (data[14 /* phishingTermsWeight */] <5.1260858f ? 
                             (data[14 /* phishingTermsWeight */] <4.495176f ? 
                                0.105363734f : 
                                -0.1361363f) : 
                             (data[14 /* phishingTermsWeight */] <5.3818984f ? 
                                0.10332583f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.1877074f ? 
                                    0.10133225f : 
                                    0.101292595f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.0553265f ? 
                             (data[14 /* phishingTermsWeight */] <4.047076f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9588544f ? 
                                    0.10798307f : 
                                    -0.046583205f) : 
                                 (data[14 /* phishingTermsWeight */] <4.248187f ? 
                                    0.11770102f : 
                                    0.10611458f)) : 
                             (data[14 /* phishingTermsWeight */] <5.380819f ? 
                                 (data[14 /* phishingTermsWeight */] <5.171098f ? 
                                    -0.0738563f : 
                                    0.028571432f) : 
                                 (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[12])) ? 
                                    0.102619834f : 
                                    0.11118156f))))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.0453167f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.084868f ? 
                         (data[14 /* phishingTermsWeight */] <2.4208643f ? 
                             (data[7 /* imagesAsURL */] <42.5f ? 
                                0.019762035f : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <115.5f ? 
                                    -0.104563266f : 
                                    -0.10740693f)) : 
                             (data[14 /* phishingTermsWeight */] <3.158871f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <45.5f ? 
                                    -0.11649847f : 
                                    -0.10392605f) : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                                    -0.092422724f : 
                                    0.033842627f))) : 
                        -0.10613256f) : 
                     (data[14 /* phishingTermsWeight */] <7.645553f ? 
                        0.105214186f : 
                        0.10100763f)))));
    return pred;
  } // constant pool size = 280B, number of visited nodes = 62, static init size = 180B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_66 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_66_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_66_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4271418f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8167042f ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.7911822f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.4944889f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.111260004f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.0250335f ? 
                                    -0.007192982f : 
                                    -0.10266647f) : 
                                 (data[14 /* phishingTermsWeight */] <0.22647412f ? 
                                    -0.06023482f : 
                                    -4.5847116E-4f)) : 
                            0.08449006f) : 
                        -0.039117903f) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.10208803f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.06540014f ? 
                            -0.013321716f : 
                            -0.10311578f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.493417f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.3920071f ? 
                                 (data[14 /* phishingTermsWeight */] <0.29843342f ? 
                                    0.10585947f : 
                                    0.028309423f) : 
                                -0.10727241f) : 
                             (data[14 /* phishingTermsWeight */] <0.6303821f ? 
                                0.10264616f : 
                                 (data[14 /* phishingTermsWeight */] <0.78941387f ? 
                                    0.057928417f : 
                                    0.05070068f))))) : 
                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[6])) ? 
                     (data[14 /* phishingTermsWeight */] <0.93365896f ? 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.0f ? 
                                -0.06374812f : 
                                0.1116417f) : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                -0.048535414f : 
                                -0.109773315f)) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3929256f ? 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                                 (data[14 /* phishingTermsWeight */] <1.1604624f ? 
                                    -0.0019461823f : 
                                    -0.057135195f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.1272533f ? 
                                    -0.03023486f : 
                                    0.027115183f)) : 
                            0.10698147f)) : 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                        -0.08592238f : 
                        0.044956878f))) : 
            -0.12695408f) : 
         (data[14 /* phishingTermsWeight */] <1.6308396f ? 
             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[6])) ? 
                -0.09658513f : 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                    0.102274194f : 
                    0.22005475f)) : 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                 (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (data[14 /* phishingTermsWeight */] <2.35442f ? 
                        0.03797199f : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.8025336f ? 
                                 (data[14 /* phishingTermsWeight */] <2.987337f ? 
                                    -0.10931216f : 
                                    -0.040518098f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <7.5604277f ? 
                                    0.10479718f : 
                                    0.10093932f)) : 
                            0.10173477f)) : 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                        0.011839031f : 
                        0.014915454f)) : 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <8.0f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8015807f ? 
                             (data[14 /* phishingTermsWeight */] <1.8934546f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8033485f ? 
                                    0.008857685f : 
                                    -0.1304723f) : 
                                 (data[14 /* phishingTermsWeight */] <2.0838876f ? 
                                    0.117510065f : 
                                    0.05430412f)) : 
                             (data[14 /* phishingTermsWeight */] <4.0051303f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9633455f ? 
                                    0.08486518f : 
                                    -0.12063905f) : 
                                 (data[14 /* phishingTermsWeight */] <4.1985025f ? 
                                    0.14247125f : 
                                    0.017620739f))) : 
                         (data[14 /* phishingTermsWeight */] <2.836807f ? 
                            -0.14117876f : 
                             (data[14 /* phishingTermsWeight */] <3.0736248f ? 
                                -0.09504414f : 
                                 (data[14 /* phishingTermsWeight */] <3.8728852f ? 
                                    0.09383659f : 
                                    0.10171125f)))) : 
                    -0.10284941f))));
    return pred;
  } // constant pool size = 248B, number of visited nodes = 49, static init size = 300B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_67 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_67_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_67_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                -0.10589073f : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.0676506f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.396602f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                             (data[3 /* domainsCount */] <0.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.6383657f ? 
                                    0.037649743f : 
                                    -0.032877866f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.0311635f ? 
                                    -0.04820845f : 
                                    -0.1322822f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.5088643f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.82987535f ? 
                                    -0.10223667f : 
                                    -0.1016941f) : 
                                 (data[14 /* phishingTermsWeight */] <1.8338505f ? 
                                    -0.112504676f : 
                                    -0.103849284f))) : 
                        0.093887836f) : 
                     (data[14 /* phishingTermsWeight */] <3.5532439f ? 
                        -0.14803997f : 
                        -0.10985471f))) : 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3147074f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.2017248f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.126617f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8630194f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.6041136f ? 
                                    -0.021473875f : 
                                    0.053061143f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9419875f ? 
                                    -0.04881047f : 
                                    -0.0077641252f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8630194f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    0.040420033f : 
                                    0.10005779f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                    -0.0490932f : 
                                    0.08211418f))) : 
                        0.10231983f) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.2260858f ? 
                        -0.03529492f : 
                        -0.08880615f)) : 
                 (data[3 /* domainsCount */] <2.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.405644f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.190443f ? 
                                 (data[14 /* phishingTermsWeight */] <1.7385213f ? 
                                    -0.028161203f : 
                                    0.034050982f) : 
                                -0.13553031f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.234167f ? 
                                 (data[14 /* phishingTermsWeight */] <2.5430198f ? 
                                    -0.004856447f : 
                                    0.07878217f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5419042f ? 
                                    0.13215661f : 
                                    0.14276402f))) : 
                         (data[14 /* phishingTermsWeight */] <2.1904433f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8901316f ? 
                                 (data[14 /* phishingTermsWeight */] <1.360296f ? 
                                    0.110606275f : 
                                    0.03334068f) : 
                                -0.07755148f) : 
                             (data[14 /* phishingTermsWeight */] <2.4143353f ? 
                                0.12907183f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5226004f ? 
                                    0.09195062f : 
                                    0.018612564f)))) : 
                     (data[14 /* phishingTermsWeight */] <2.1800554f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.046745f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                                 (data[14 /* phishingTermsWeight */] <1.3775623f ? 
                                    -0.048841488f : 
                                    0.029006911f) : 
                                 (data[3 /* domainsCount */] <8.5f ? 
                                    0.12403137f : 
                                    0.05302511f)) : 
                             (data[3 /* domainsCount */] <5.5f ? 
                                0.12677306f : 
                                0.13086152f)) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.274931f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.4425209f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.0679364f ? 
                                    0.0041561155f : 
                                    -0.083863966f) : 
                                 (data[14 /* phishingTermsWeight */] <3.5618768f ? 
                                    0.068020016f : 
                                    0.013607284f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.6558175f ? 
                                -0.0841099f : 
                                -0.09846964f)))))) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                 (data[14 /* phishingTermsWeight */] <2.2736323f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7690443f ? 
                             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                                0.034281682f : 
                                0.10952238f) : 
                            0.066747464f) : 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                            -0.043699495f : 
                             (data[14 /* phishingTermsWeight */] <1.9490304f ? 
                                0.124246754f : 
                                0.10716238f))) : 
                     (data[3 /* domainsCount */] <0.5f ? 
                         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[0])) ? 
                             (data[14 /* phishingTermsWeight */] <4.3815465f ? 
                                -0.19472218f : 
                                0.10334709f) : 
                            0.025934428f) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
                             (data[14 /* phishingTermsWeight */] <4.241019f ? 
                                -0.08714382f : 
                                 (data[14 /* phishingTermsWeight */] <4.926609f ? 
                                    0.10188916f : 
                                    0.100575134f)) : 
                             (data[14 /* phishingTermsWeight */] <2.5546875f ? 
                                -0.018717341f : 
                                 (data[14 /* phishingTermsWeight */] <4.1567025f ? 
                                    0.10588401f : 
                                    0.1032853f))))) : 
                 (data[14 /* phishingTermsWeight */] <2.177545f ? 
                    -0.15953714f : 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[0])) ? 
                        -0.11978378f : 
                         (data[14 /* phishingTermsWeight */] <3.2495186f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.0226014f ? 
                                 (data[14 /* phishingTermsWeight */] <2.5145586f ? 
                                    0.102345064f : 
                                    0.10720095f) : 
                                -0.12228335f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.8043885f ? 
                                 (data[14 /* phishingTermsWeight */] <4.1723948f ? 
                                    0.108849876f : 
                                    0.104179166f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.6405277f ? 
                                    0.10154066f : 
                                    0.10108479f)))))) : 
             (data[14 /* phishingTermsWeight */] <3.9441223f ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.0f ? 
                     (data[14 /* phishingTermsWeight */] <2.929298f ? 
                        0.110033505f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8627243f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3836167f ? 
                                0.101950705f : 
                                0.10703361f) : 
                            0.101322815f)) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <10.5f ? 
                         (data[14 /* phishingTermsWeight */] <3.2877424f ? 
                            -0.041484218f : 
                            -0.0678798f) : 
                        0.105866715f)) : 
                 (data[14 /* phishingTermsWeight */] <4.028574f ? 
                    -0.21986847f : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.8159146f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.0444784f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <17.5f ? 
                                 (data[3 /* domainsCount */] <6.5f ? 
                                    0.032941837f : 
                                    0.10606402f) : 
                                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[9])) ? 
                                    -0.111976184f : 
                                    -0.06986547f)) : 
                             (data[14 /* phishingTermsWeight */] <5.207116f ? 
                                -0.14707176f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <10.5f ? 
                                    -0.09184887f : 
                                    0.06916996f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <7.5824723f ? 
                             (data[3 /* domainsCount */] <7.5f ? 
                                0.10454429f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <10.5f ? 
                                    0.10185695f : 
                                    0.101375565f)) : 
                             (data[14 /* phishingTermsWeight */] <8.244931f ? 
                                0.10091675f : 
                                0.10053642f)))))));
    return pred;
  } // constant pool size = 411B, number of visited nodes = 91, static init size = 270B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_68 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_68_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_68_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[11])) ? 
             (data[4 /* dotsCount */] <0.5f ? 
                -0.066392496f : 
                0.020837752f) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                0.012989998f : 
                0.05072298f)) : 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <4.5f ? 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                     (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
                        -0.010538987f : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                            0.030456832f : 
                            0.0855387f)) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[11])) ? 
                            0.10127449f : 
                            0.05981657f) : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                            -0.050386935f : 
                            -0.03697509f))) : 
                0.034641616f) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <15.5f ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                     (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[11])) ? 
                                -0.09805307f : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                                    -0.029047871f : 
                                    -0.05208353f)) : 
                            -0.14060266f) : 
                        0.10101704f) : 
                    0.0067923972f) : 
                -0.114328586f)));
    return pred;
  } // constant pool size = 99B, number of visited nodes = 18, static init size = 150B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_69 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_69_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_69_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.5520852f ? 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3504959f ? 
            -0.009135854f : 
             (data[14 /* phishingTermsWeight */] <1.36867f ? 
                -0.12403277f : 
                 (data[14 /* phishingTermsWeight */] <1.4269667f ? 
                    0.09001306f : 
                     (data[14 /* phishingTermsWeight */] <1.492468f ? 
                        -0.12492789f : 
                        2.7995935E-4f)))) : 
         (data[14 /* phishingTermsWeight */] <1.6282272f ? 
            0.14481106f : 
             (data[14 /* phishingTermsWeight */] <1.7187054f ? 
                -0.042848624f : 
                 (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                         (data[14 /* phishingTermsWeight */] <2.672496f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.626129f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.0534942f ? 
                                    0.009761421f : 
                                    -0.03986701f) : 
                                -0.11124683f) : 
                             (data[14 /* phishingTermsWeight */] <3.7169442f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5203698f ? 
                                    0.035829473f : 
                                    0.14680707f) : 
                                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[8])) ? 
                                    0.013042253f : 
                                    0.10275987f))) : 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                            0.0012272869f : 
                            0.07442037f)) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.818525f ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                                 (data[14 /* phishingTermsWeight */] <2.4473953f ? 
                                    -0.009303557f : 
                                    -0.0931856f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.0592997f ? 
                                    -0.023451319f : 
                                    -0.05064619f)) : 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.594716f ? 
                                    0.021261679f : 
                                    -0.037212536f) : 
                                 (data[14 /* phishingTermsWeight */] <2.3709073f ? 
                                    0.016293509f : 
                                    0.07707682f))) : 
                        -0.08910665f)))));
    return pred;
  } // constant pool size = 133B, number of visited nodes = 24, static init size = 210B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_70 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_70_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_70_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[6])) ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                    -0.02725911f : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                            -0.020074002f : 
                            -0.018829482f) : 
                        0.01776734f)) : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                    0.10122457f : 
                    0.038497057f)) : 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[8])) ? 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[10])) ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[9])) ? 
                            -0.025930222f : 
                            0.011278705f) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[9])) ? 
                            -0.017484743f : 
                            0.022671523f)) : 
                    0.0581808f) : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[9])) ? 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[10])) ? 
                        -0.03980048f : 
                        0.10147856f) : 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[10])) ? 
                        -0.009105709f : 
                        0.00300681f)))) : 
         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[15])) ? 
             (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[8])) ? 
                -0.0599987f : 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[9])) ? 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[10])) ? 
                        -0.02024697f : 
                        -0.028235605f) : 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[10])) ? 
                        0.100736044f : 
                        0.11140133f))) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                     (data[4 /* dotsCount */] <1.5f ? 
                         (data[4 /* dotsCount */] <0.5f ? 
                            0.009886614f : 
                            0.12213696f) : 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[10])) ? 
                            0.10099245f : 
                            0.10522851f)) : 
                    -0.03768946f) : 
                -0.050126564f)));
    return pred;
  } // constant pool size = 197B, number of visited nodes = 25, static init size = 570B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_71 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_71_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_71_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.55367035f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.27683517f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.048446156f ? 
                                    0.029390765f : 
                                    -0.10141861f) : 
                                0.11339261f) : 
                             (data[14 /* phishingTermsWeight */] <0.8456977f ? 
                                -0.060527183f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.96737576f ? 
                                    -0.102578826f : 
                                    -0.0143993115f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.85180056f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.04259003f ? 
                                -0.10603671f : 
                                -0.10783303f) : 
                            0.020390743f)) : 
                    0.04550573f) : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8571243f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.22767365f ? 
                            -0.0020977217f : 
                            0.067924365f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0749985f ? 
                            -0.10873948f : 
                            0.025383139f)) : 
                     (data[14 /* phishingTermsWeight */] <0.104527354f ? 
                        0.1368f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9486967f ? 
                            0.02467785f : 
                            0.12591992f)))) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                    -0.120352976f : 
                    -0.018904224f) : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                     (data[14 /* phishingTermsWeight */] <0.103228875f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                                -0.10150174f : 
                                -0.0068859686f) : 
                             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                                -0.101225324f : 
                                0.0030590154f)) : 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[0])) ? 
                             (data[14 /* phishingTermsWeight */] <0.7370899f ? 
                                -0.07525189f : 
                                 (data[14 /* phishingTermsWeight */] <0.9122357f ? 
                                    0.01663035f : 
                                    -0.05274889f)) : 
                             (data[14 /* phishingTermsWeight */] <1.2708676f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.97769594f ? 
                                    -0.10213422f : 
                                    -0.15700193f) : 
                                -0.10125241f))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.84877074f ? 
                        0.069894046f : 
                        -0.042945087f)))) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[0])) ? 
                -0.020378355f : 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[10])) ? 
                     (data[14 /* phishingTermsWeight */] <2.5975316f ? 
                        -0.05264979f : 
                         (data[14 /* phishingTermsWeight */] <3.1330988f ? 
                            0.11763725f : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                 (data[4 /* dotsCount */] <1.5f ? 
                                    -0.06799951f : 
                                    0.10317531f) : 
                                -0.056623247f))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8250768f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                             (data[4 /* dotsCount */] <0.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.201939f ? 
                                    -0.013308716f : 
                                    -0.13737099f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                    0.06470871f : 
                                    -0.029836671f)) : 
                             (data[14 /* phishingTermsWeight */] <1.9739612f ? 
                                -0.07492768f : 
                                -0.016409248f)) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.0968456f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (data[14 /* phishingTermsWeight */] <4.0372577f ? 
                                    -0.05310362f : 
                                    0.07335613f) : 
                                 (data[14 /* phishingTermsWeight */] <4.159972f ? 
                                    0.1281198f : 
                                    0.10626954f)) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.8213296f ? 
                                    0.10336558f : 
                                    0.10086779f) : 
                                 (data[14 /* phishingTermsWeight */] <5.268421f ? 
                                    -0.08683194f : 
                                    0.10159916f)))))) : 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.0500026f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.2874255f ? 
                     (data[4 /* dotsCount */] <2.5f ? 
                         (data[14 /* phishingTermsWeight */] <3.1066482f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <59.5f ? 
                                 (data[7 /* imagesAsURL */] <12.5f ? 
                                    -0.12088944f : 
                                    -0.13022637f) : 
                                -0.1062134f) : 
                             (data[14 /* phishingTermsWeight */] <3.328428f ? 
                                -0.10168142f : 
                                 (data[14 /* phishingTermsWeight */] <4.6480174f ? 
                                    -0.09609329f : 
                                    -0.10171024f))) : 
                         (data[14 /* phishingTermsWeight */] <2.239612f ? 
                             (data[7 /* imagesAsURL */] <21.5f ? 
                                0.1031203f : 
                                -0.10466205f) : 
                             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[10])) ? 
                                 (data[7 /* imagesAsURL */] <36.5f ? 
                                    -0.103418246f : 
                                    -0.10446909f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <12.5f ? 
                                    0.05052187f : 
                                    -0.07587373f)))) : 
                    -0.10471215f) : 
                 (data[14 /* phishingTermsWeight */] <7.6479692f ? 
                    0.10403528f : 
                    0.10062732f))));
    return pred;
  } // constant pool size = 307B, number of visited nodes = 65, static init size = 270B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_72 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_72_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_72_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.5f ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                     (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[5])) ? 
                        -0.01721528f : 
                        -0.01582884f) : 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[5])) ? 
                        0.013551009f : 
                        0.15644008f)) : 
                 (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[5])) ? 
                     (data[4 /* dotsCount */] <0.5f ? 
                        0.04795293f : 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                            -0.014649151f : 
                            0.10091157f)) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                        0.025386784f : 
                        0.07585971f))) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                 (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[5])) ? 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                            -0.030250816f : 
                            0.080198586f) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[9])) ? 
                            -0.018065589f : 
                            0.008135064f)) : 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[15])) ? 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[9])) ? 
                            -0.018405901f : 
                            0.006756788f) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[9])) ? 
                            -0.024812335f : 
                            0.025407456f))) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <3.5f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[15])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                 (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[5])) ? 
                                    0.042846795f : 
                                    0.10495179f) : 
                                 (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[5])) ? 
                                    -0.015341311f : 
                                    0.10195341f)) : 
                            0.10088178f) : 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[15])) ? 
                            -0.12388773f : 
                             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[9])) ? 
                                -0.028708197f : 
                                 (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[5])) ? 
                                    0.10328567f : 
                                    0.109862246f)))) : 
                    0.056122344f))) : 
         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[5])) ? 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[15])) ? 
                -0.11055614f : 
                 (data[7 /* imagesAsURL */] <12.5f ? 
                    -0.112100184f : 
                     (data[4 /* dotsCount */] <2.5f ? 
                         (data[7 /* imagesAsURL */] <71.0f ? 
                            -0.12330075f : 
                            -0.10324157f) : 
                         (data[7 /* imagesAsURL */] <54.5f ? 
                            0.056199722f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <112.5f ? 
                                 (data[7 /* imagesAsURL */] <78.5f ? 
                                    -0.10366447f : 
                                    -0.102803566f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <117.5f ? 
                                    -0.1058275f : 
                                    -0.10403342f)))))) : 
             (data[7 /* imagesAsURL */] <8.5f ? 
                0.10761912f : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <16.5f ? 
                     (data[7 /* imagesAsURL */] <13.0f ? 
                        -0.10661689f : 
                        -0.038565896f) : 
                    -0.07879823f))));
    return pred;
  } // constant pool size = 258B, number of visited nodes = 39, static init size = 600B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_73 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_73_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_73_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.5f ? 
         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[12])) ? 
                -0.11636201f : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[6])) ? 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                            -0.028298968f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                -0.015190408f : 
                                -0.10142046f)) : 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                            -0.047713682f : 
                            0.04339471f)) : 
                    -0.10395793f)) : 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[12])) ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                    -0.036229566f : 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[6])) ? 
                        0.10088943f : 
                        0.019004077f)) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[15])) ? 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                            -0.0068258108f : 
                            0.0067174295f) : 
                        0.012457424f) : 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                         (data[7 /* imagesAsURL */] <1.5f ? 
                            0.105542555f : 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[15])) ? 
                                0.10100694f : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                    0.10387062f : 
                                    0.10091184f))) : 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[15])) ? 
                            0.03195125f : 
                             (data[7 /* imagesAsURL */] <1.5f ? 
                                0.098901585f : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                    0.010907306f : 
                                    0.020295769f))))))) : 
         (data[7 /* imagesAsURL */] <14.5f ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <7.5f ? 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[15])) ? 
                            -0.11891332f : 
                            -0.047359258f) : 
                        0.020328349f) : 
                     (data[7 /* imagesAsURL */] <9.5f ? 
                        -0.10667844f : 
                        -0.10408903f)) : 
                0.007679603f) : 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[15])) ? 
                -0.108373225f : 
                 (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[12])) ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <129.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <112.5f ? 
                             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[6])) ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <64.0f ? 
                                    -0.09364185f : 
                                    -0.10295773f) : 
                                 (data[7 /* imagesAsURL */] <66.5f ? 
                                    8.0206766E-5f : 
                                    -0.10326403f)) : 
                             (data[7 /* imagesAsURL */] <116.0f ? 
                                -0.112651035f : 
                                -0.10521086f)) : 
                        -0.10229403f) : 
                    -0.067906685f))));
    return pred;
  } // constant pool size = 227B, number of visited nodes = 35, static init size = 510B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_74 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_74_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_74_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.5f ? 
         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[9])) ? 
                -0.1114461f : 
                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[11])) ? 
                    -0.12570119f : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                        -0.014107688f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                            -0.10245025f : 
                            -0.1035728f)))) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                 (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[8])) ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                                0.005986303f : 
                                0.03138969f) : 
                             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[11])) ? 
                                0.10162463f : 
                                0.02124489f)) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[9])) ? 
                            0.10116448f : 
                            0.036314156f)) : 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[9])) ? 
                        0.10594375f : 
                        0.10509901f)) : 
                 (data[7 /* imagesAsURL */] <1.5f ? 
                    0.070707336f : 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[9])) ? 
                         (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                            0.0066009634f : 
                            0.10170908f) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[11])) ? 
                                0.10815526f : 
                                0.051147256f) : 
                            0.013814818f))))) : 
         (data[7 /* imagesAsURL */] <14.5f ? 
             (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                     (data[7 /* imagesAsURL */] <6.5f ? 
                        -0.026437998f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <9.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                                -0.03678191f : 
                                -0.11076501f) : 
                            -0.103694014f)) : 
                    -0.111390494f) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                    -0.07705974f : 
                    0.13019688f)) : 
             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                 (data[7 /* imagesAsURL */] <22.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <17.5f ? 
                        -0.08826613f : 
                        -0.10213047f) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <104.5f ? 
                         (data[7 /* imagesAsURL */] <48.5f ? 
                            -0.031486787f : 
                             (data[7 /* imagesAsURL */] <67.5f ? 
                                -0.10628337f : 
                                -0.103558965f)) : 
                        -0.110912465f)) : 
                 (data[7 /* imagesAsURL */] <22.5f ? 
                    -0.07609246f : 
                    -0.10619924f))));
    return pred;
  } // constant pool size = 209B, number of visited nodes = 33, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_75 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_75_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_75_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.9127166f ? 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8267938f ? 
             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[11])) ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.5056777f ? 
                     (data[14 /* phishingTermsWeight */] <0.82963526f ? 
                        -0.06808253f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4082838f ? 
                            -0.12264191f : 
                            -0.12333938f)) : 
                    0.04408512f) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7839783f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.1149864f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8013965f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.47867036f ? 
                                    -0.008314034f : 
                                    0.025718875f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.11966759f ? 
                                    0.12456941f : 
                                    0.13238932f)) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0076177f ? 
                                    -0.039288938f : 
                                    -0.11427839f) : 
                                0.09338422f)) : 
                         (data[14 /* phishingTermsWeight */] <1.1986048f ? 
                            0.089863434f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <5.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.754667f ? 
                                    8.137277E-4f : 
                                    -0.10884282f) : 
                                -0.102304295f))) : 
                    0.051443215f)) : 
            -0.06599843f) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.0f ? 
             (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[5])) ? 
                 (data[14 /* phishingTermsWeight */] <2.6841671f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.6253064f ? 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                             (data[14 /* phishingTermsWeight */] <2.0696595f ? 
                                0.075909175f : 
                                 (data[14 /* phishingTermsWeight */] <2.0963705f ? 
                                    -0.15934147f : 
                                    -9.1297325E-4f)) : 
                            0.11964265f) : 
                        -0.0988083f) : 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                         (data[14 /* phishingTermsWeight */] <5.145578f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.0367756f ? 
                                 (data[14 /* phishingTermsWeight */] <4.0031524f ? 
                                    -0.039301015f : 
                                    0.05274575f) : 
                                -0.04617068f) : 
                             (data[14 /* phishingTermsWeight */] <5.857629f ? 
                                0.111993186f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.716046f ? 
                                    0.101288974f : 
                                    0.10062528f))) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                             (data[14 /* phishingTermsWeight */] <3.8093836f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3792589f ? 
                                    0.01817195f : 
                                    0.13749605f) : 
                                 (data[14 /* phishingTermsWeight */] <4.0136514f ? 
                                    -0.035824332f : 
                                    0.055195995f)) : 
                             (data[14 /* phishingTermsWeight */] <4.0906878f ? 
                                0.10411443f : 
                                0.101751044f)))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.7705593f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                             (data[14 /* phishingTermsWeight */] <2.5468144f ? 
                                -0.11159457f : 
                                0.055899262f) : 
                             (data[14 /* phishingTermsWeight */] <2.2747922f ? 
                                 (data[14 /* phishingTermsWeight */] <2.0911772f ? 
                                    0.1212503f : 
                                    0.03778041f) : 
                                 (data[14 /* phishingTermsWeight */] <2.6420221f ? 
                                    0.06408674f : 
                                    0.07376782f))) : 
                        -0.10606475f) : 
                    -0.07559797f)) : 
             (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[5])) ? 
                 (data[14 /* phishingTermsWeight */] <2.3364353f ? 
                     (data[7 /* imagesAsURL */] <41.0f ? 
                        0.034607086f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.27843f ? 
                             (data[7 /* imagesAsURL */] <96.5f ? 
                                -0.10306282f : 
                                -0.103716776f) : 
                            -0.101388425f)) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.4094503f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <46.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.134349f ? 
                                 (data[7 /* imagesAsURL */] <9.5f ? 
                                    -0.11329118f : 
                                    -0.10939139f) : 
                                -0.14515476f) : 
                             (data[14 /* phishingTermsWeight */] <2.647507f ? 
                                -0.104332395f : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <119.5f ? 
                                    -0.1055043f : 
                                    -0.10152703f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.2946877f ? 
                             (data[14 /* phishingTermsWeight */] <3.5258677f ? 
                                0.0033031474f : 
                                 (data[14 /* phishingTermsWeight */] <3.7039576f ? 
                                    -0.10423011f : 
                                    -0.04660709f)) : 
                            -0.10877866f))) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <9.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.5f ? 
                             (data[14 /* phishingTermsWeight */] <4.20554f ? 
                                0.10270303f : 
                                 (data[14 /* phishingTermsWeight */] <4.553407f ? 
                                    -0.06457846f : 
                                    0.10169273f)) : 
                            0.106975086f) : 
                        -0.094222136f) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <23.0f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.129761f ? 
                            -0.035468776f : 
                            -0.09162514f) : 
                        -0.044757225f)))));
    return pred;
  } // constant pool size = 284B, number of visited nodes = 63, static init size = 180B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_76 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_76_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_76_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[12])) ? 
                    -0.10751897f : 
                    -0.011866764f) : 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                    0.024743037f : 
                    0.1081374f)) : 
             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[12])) ? 
                -0.11863574f : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                    0.030284323f : 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                        0.10081067f : 
                        0.05741525f)))) : 
         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <5.5f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                 (Double.isNaN(data[13 /* isSuspendTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[13]) || (GenModel.bitSetIsInRange(32, 0, data[13]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[13])) ? 
                                    -0.024934035f : 
                                    0.08388231f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                                    -0.075173646f : 
                                    -0.10236003f)) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.07337383f : 
                                    -0.060666878f) : 
                                0.06410714f)) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                             (data[2 /* hexadecimalURLs */] <1.5f ? 
                                0.16410764f : 
                                0.0024888064f) : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                -0.056366622f : 
                                0.0055319443f))) : 
                    0.03941199f) : 
                0.043393005f) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[12])) ? 
                    -0.03963222f : 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[9])) ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                            -0.057675254f : 
                            0.09599742f) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                    0.010475324f : 
                                    -0.10428894f) : 
                                 (data[2 /* hexadecimalURLs */] <2.5f ? 
                                    0.10371662f : 
                                    0.09068941f)) : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                                    -0.028636638f : 
                                    -9.3118567E-4f) : 
                                -0.1448946f)))) : 
                 (data[4 /* dotsCount */] <6.5f ? 
                    0.0024018846f : 
                    -0.115139425f))));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 32, static init size = 300B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_77 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_77_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_77_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[11])) ? 
             (data[4 /* dotsCount */] <0.5f ? 
                -0.05401933f : 
                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[6])) ? 
                    -0.01595741f : 
                    0.10037553f)) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[8])) ? 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[6])) ? 
                        -2.1214689E-4f : 
                        0.010232984f) : 
                    0.12688269f) : 
                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[6])) ? 
                    0.11285771f : 
                    0.030270535f))) : 
         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[11])) ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <13.5f ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[6])) ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    -0.022160238f : 
                                    0.033370797f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <19.5f ? 
                                    0.0330126f : 
                                    -0.10147421f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                 (data[3 /* domainsCount */] <1.5f ? 
                                    0.101557806f : 
                                    -0.03924203f) : 
                                 (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                                    -0.036296993f : 
                                    0.01544591f))) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    0.033915836f : 
                                    -0.10455162f) : 
                                 (data[3 /* domainsCount */] <5.5f ? 
                                    0.0928049f : 
                                    0.069223925f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                 (data[3 /* domainsCount */] <1.5f ? 
                                    -0.0945739f : 
                                    0.088978596f) : 
                                 (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                                    -0.057199772f : 
                                    -0.05809935f)))) : 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <6.5f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    -0.06634028f : 
                                    -0.009373328f) : 
                                0.024846075f) : 
                            -0.0809539f) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                            -0.020471547f : 
                            0.0123058185f))) : 
                -0.110495634f) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <18.5f ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                                    0.10172996f : 
                                    0.03234636f) : 
                                 (data[3 /* domainsCount */] <1.5f ? 
                                    0.10275945f : 
                                    0.102391146f)) : 
                             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[6])) ? 
                                -0.1024761f : 
                                0.10063583f)) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.0f ? 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[6])) ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                    0.100419454f : 
                                    0.1010129f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                    0.10749775f : 
                                    0.11241792f)) : 
                            -0.025090586f)) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                        -0.087875515f : 
                        -0.086343676f)) : 
                0.11102117f)));
    return pred;
  } // constant pool size = 243B, number of visited nodes = 44, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_78 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_78_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_78_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[12])) ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.0268407f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0321934f ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                        -0.10428093f : 
                         (data[14 /* phishingTermsWeight */] <0.18690932f ? 
                            -0.10025758f : 
                             (data[14 /* phishingTermsWeight */] <0.9262065f ? 
                                -0.10047724f : 
                                -0.100487754f))) : 
                    -0.102689855f) : 
                -0.12455417f) : 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.0085807f ? 
                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[6])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.5848957f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.79244787f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.47546872f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.39226168f ? 
                                    -0.007930977f : 
                                    -0.10594211f) : 
                                0.08218548f) : 
                             (data[14 /* phishingTermsWeight */] <0.8686047f ? 
                                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                    -0.035514005f : 
                                    -0.10428196f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3483931f ? 
                                    -0.1017658f : 
                                    -0.10638549f))) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7528251f ? 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                                0.006073559f : 
                                0.029509008f) : 
                             (data[14 /* phishingTermsWeight */] <1.8363101f ? 
                                -0.104039684f : 
                                -0.10149156f))) : 
                    0.06201784f) : 
                 (data[14 /* phishingTermsWeight */] <2.184901f ? 
                    -0.13128679f : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5013351f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.0661895f ? 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.505445f ? 
                                    -0.025671648f : 
                                    -0.07551545f) : 
                                 (data[14 /* phishingTermsWeight */] <2.4431403f ? 
                                    -0.0416308f : 
                                    0.100477435f)) : 
                            -0.101690136f) : 
                        0.03137732f)))) : 
         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[12])) ? 
             (data[14 /* phishingTermsWeight */] <4.0171614f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.1884387f ? 
                     (data[14 /* phishingTermsWeight */] <0.26402983f ? 
                        -0.1031896f : 
                        -0.107167415f) : 
                    -0.04303389f) : 
                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[6])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.4320235f ? 
                        0.05830188f : 
                        0.1011396f) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.52645f ? 
                        0.08116734f : 
                        0.11232367f))) : 
             (data[14 /* phishingTermsWeight */] <1.3147074f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.2017248f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.126617f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8449627f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.4647295f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.13941884f ? 
                                    -0.0075730667f : 
                                    0.015727058f) : 
                                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[15])) ? 
                                    0.007268042f : 
                                    0.07112624f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0061291f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.95201105f ? 
                                    -0.035186075f : 
                                    0.015806872f) : 
                                -0.058764078f)) : 
                        0.08557989f) : 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[15])) ? 
                        -0.080022454f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.2260858f ? 
                            -0.003067776f : 
                            -0.08311944f))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8254333f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.3179126f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.1934724f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.1001422f ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[15])) ? 
                                    0.012112405f : 
                                    0.034753725f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.1310205f ? 
                                    0.13701564f : 
                                    0.10500636f)) : 
                             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[6])) ? 
                                -0.104836956f : 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[15])) ? 
                                    0.100772925f : 
                                    0.101930596f))) : 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[6])) ? 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[15])) ? 
                                 (data[14 /* phishingTermsWeight */] <3.4559715f ? 
                                    0.046655778f : 
                                    0.012782958f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.7697415f ? 
                                    0.103072405f : 
                                    0.102396734f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5187254f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5091326f ? 
                                    0.08222192f : 
                                    0.1184099f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.6783018f ? 
                                    0.07202116f : 
                                    0.10809874f)))) : 
                     (data[14 /* phishingTermsWeight */] <3.9980457f ? 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[15])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.958209f ? 
                                0.108083636f : 
                                -0.09938455f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9509661f ? 
                                 (data[14 /* phishingTermsWeight */] <3.9045203f ? 
                                    0.10227904f : 
                                    0.041546613f) : 
                                0.10400918f)) : 
                         (data[14 /* phishingTermsWeight */] <4.165264f ? 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[15])) ? 
                                -0.0064181094f : 
                                0.12326157f) : 
                             (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[8])) ? 
                                 (data[14 /* phishingTermsWeight */] <4.942829f ? 
                                    -0.11054886f : 
                                    0.102342054f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.2020173f ? 
                                    0.028335476f : 
                                    0.020988313f))))))));
    return pred;
  } // constant pool size = 369B, number of visited nodes = 68, static init size = 570B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_79 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_79_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_79_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.5f ? 
         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[9])) ? 
                -0.10935556f : 
                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[6])) ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                             (data[3 /* domainsCount */] <0.5f ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                                    0.0029992817f : 
                                    0.03617459f) : 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                    -0.091359586f : 
                                    -0.030447397f)) : 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                                -0.10257419f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.0f ? 
                                    -0.1033371f : 
                                    -0.10273905f))) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                            -0.10059968f : 
                             (data[3 /* domainsCount */] <3.5f ? 
                                -0.104608834f : 
                                -0.10136358f))) : 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                        -0.070847265f : 
                        0.03525714f))) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[15])) ? 
                             (data[3 /* domainsCount */] <0.5f ? 
                                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                                    -0.05801201f : 
                                    -0.030639542f) : 
                                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                                    -0.01598957f : 
                                    0.018348027f)) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[6])) ? 
                                    -0.0063613867f : 
                                    0.0019706099f) : 
                                0.124573246f)) : 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[15])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[6])) ? 
                                    -0.013100735f : 
                                    0.0137628885f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                    -0.08477709f : 
                                    0.13348693f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                    0.03280326f : 
                                    -0.07371032f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                    0.114397526f : 
                                    -0.019274795f)))) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[6])) ? 
                             (data[3 /* domainsCount */] <1.5f ? 
                                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[15])) ? 
                                    -0.06427222f : 
                                    0.10631496f) : 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[15])) ? 
                                    -0.009854676f : 
                                    0.10912416f)) : 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[15])) ? 
                                0.102151364f : 
                                 (data[3 /* domainsCount */] <1.5f ? 
                                    0.11237053f : 
                                    0.10404724f))) : 
                        0.11483518f)) : 
                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[6])) ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                        -0.078299806f : 
                        0.104079254f) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[9])) ? 
                            0.10437615f : 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT20, 32, 0, data[15])) ? 
                                0.10802321f : 
                                0.12954527f)) : 
                        -0.04386924f)))) : 
         (data[7 /* imagesAsURL */] <14.5f ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                 (data[3 /* domainsCount */] <15.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                        -0.043255202f : 
                        -0.1079147f) : 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT21, 32, 0, data[15])) ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <39.5f ? 
                             (data[3 /* domainsCount */] <34.5f ? 
                                -0.10147711f : 
                                -0.10100322f) : 
                            -0.1025089f) : 
                        0.10061603f)) : 
                0.010468056f) : 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT22, 32, 0, data[15])) ? 
                -0.10626235f : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <18.5f ? 
                     (data[3 /* domainsCount */] <5.5f ? 
                        -0.120336495f : 
                         (data[7 /* imagesAsURL */] <38.0f ? 
                            0.04836515f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <10.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                    -0.102530465f : 
                                    -0.11017744f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <98.0f ? 
                                    -0.101853795f : 
                                    -0.104164325f)))) : 
                    -0.101403244f))));
    return pred;
  } // constant pool size = 341B, number of visited nodes = 56, static init size = 690B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT20 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT21 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT22 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_80 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_80_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_80_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[12])) ? 
             (data[3 /* domainsCount */] <0.5f ? 
                -0.11453676f : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                    -0.056595415f : 
                    -0.054836944f)) : 
             (data[3 /* domainsCount */] <0.5f ? 
                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
                    -0.058417127f : 
                    0.0056719626f) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                     (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[8])) ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[9])) ? 
                             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[11])) ? 
                                -0.011809189f : 
                                -0.0015008758f) : 
                            0.015765438f) : 
                        0.10747286f) : 
                     (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[11])) ? 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
                            -0.0065985047f : 
                            3.5919325E-4f) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                            0.10083775f : 
                            0.05324575f))))) : 
         (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[11])) ? 
                -0.07139891f : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <21.5f ? 
                     (data[3 /* domainsCount */] <8.5f ? 
                        0.03506468f : 
                         (data[3 /* domainsCount */] <10.5f ? 
                            -0.09952564f : 
                             (data[3 /* domainsCount */] <13.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <11.5f ? 
                                    -0.042110838f : 
                                    0.09883869f) : 
                                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[9])) ? 
                                    -0.104342826f : 
                                    -0.05847117f)))) : 
                    0.10403927f)) : 
             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[11])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <21.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[9])) ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                                    0.009591501f : 
                                    -0.0041586007f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                    0.017978113f : 
                                    0.11765025f)) : 
                            -0.051020786f) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[9])) ? 
                            -0.052729744f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <11.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                                    0.056684375f : 
                                    0.06618166f) : 
                                 (data[3 /* domainsCount */] <12.5f ? 
                                    -0.10115982f : 
                                    0.040538475f)))) : 
                    -0.10409341f) : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[9])) ? 
                    0.101167746f : 
                    0.026201382f))));
    return pred;
  } // constant pool size = 209B, number of visited nodes = 33, static init size = 450B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_81 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_81_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_81_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.5f ? 
         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                    -0.117018946f : 
                    -0.12597433f) : 
                -0.0136058675f) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <5.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[11])) ? 
                                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[8])) ? 
                                    -0.001923612f : 
                                    0.0246653f) : 
                                0.055843648f) : 
                             (data[2 /* hexadecimalURLs */] <1.5f ? 
                                0.11803215f : 
                                0.10414603f)) : 
                        0.104628734f) : 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                        0.013685306f : 
                        0.007995765f)) : 
                 (data[7 /* imagesAsURL */] <1.5f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                        0.056263663f : 
                        0.11593685f) : 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[11])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                0.007908377f : 
                                0.012508637f) : 
                            0.10524873f) : 
                        0.13552482f)))) : 
         (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[8])) ? 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[15])) ? 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <8.0f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <15.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <10.5f ? 
                            -0.11295421f : 
                            -0.10716118f) : 
                        -0.10530493f) : 
                    -0.10120388f) : 
                 (data[7 /* imagesAsURL */] <32.5f ? 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[11])) ? 
                        -0.083055496f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <13.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                                0.0034020608f : 
                                -0.10868201f) : 
                            0.033202596f)) : 
                     (data[7 /* imagesAsURL */] <50.5f ? 
                        -0.10948468f : 
                         (data[7 /* imagesAsURL */] <65.5f ? 
                            -0.10459003f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <111.5f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <92.5f ? 
                                    -0.10243577f : 
                                    -0.10126957f) : 
                                 (data[7 /* imagesAsURL */] <115.5f ? 
                                    -0.10936915f : 
                                    -0.10159205f)))))) : 
            -0.020451354f));
    return pred;
  } // constant pool size = 186B, number of visited nodes = 31, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_82 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_82_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_82_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                 (data[3 /* domainsCount */] <0.5f ? 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[12])) ? 
                        -0.10391715f : 
                        0.0014925366f) : 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[12])) ? 
                        -0.1031798f : 
                        -0.0170652f)) : 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[12])) ? 
                            -0.10581459f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    0.0054868595f : 
                                    0.009494057f) : 
                                -4.78108E-7f)) : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                            -0.10313732f : 
                            0.025163567f)) : 
                    0.09970643f)) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <23.5f ? 
                 (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[3 /* domainsCount */] <8.0f ? 
                         (data[3 /* domainsCount */] <6.5f ? 
                            -0.023854526f : 
                            0.04354267f) : 
                         (data[3 /* domainsCount */] <10.5f ? 
                            -0.10453533f : 
                             (data[3 /* domainsCount */] <13.0f ? 
                                -0.10289091f : 
                                -0.10630356f))) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                 (data[3 /* domainsCount */] <5.5f ? 
                                    -0.009491667f : 
                                    5.3857407E-4f) : 
                                0.10804471f) : 
                            -0.009743921f) : 
                         (data[3 /* domainsCount */] <9.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                0.10149721f : 
                                0.095882f) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <15.5f ? 
                                 (data[3 /* domainsCount */] <11.5f ? 
                                    0.024153117f : 
                                    -0.058501918f) : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                    0.04683767f : 
                                    0.10736226f))))) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <42.5f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <39.5f ? 
                        -0.10099788f : 
                        -0.101486556f) : 
                    -0.019327417f))) : 
         (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[8])) ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <28.5f ? 
                 (data[3 /* domainsCount */] <1.5f ? 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[12])) ? 
                        -0.046503298f : 
                         (data[3 /* domainsCount */] <0.5f ? 
                            0.022929972f : 
                            0.054048527f)) : 
                     (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[12])) ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <22.5f ? 
                                    -0.017963821f : 
                                    0.104448274f) : 
                                -0.10943963f) : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                    0.101032734f : 
                                    0.101141036f) : 
                                0.1072444f)) : 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                            0.107537955f : 
                            0.100782596f))) : 
                 (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[12])) ? 
                    -0.107192665f : 
                    0.06318108f)) : 
            0.054759517f));
    return pred;
  } // constant pool size = 215B, number of visited nodes = 42, static init size = 270B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_83 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_83_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_83_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[5])) ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[12])) ? 
                        -0.102965675f : 
                        0.019471407f) : 
                    -0.07266143f) : 
                0.025067622f) : 
             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[6])) ? 
                -0.0148352785f : 
                 (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[5])) ? 
                    -0.070816666f : 
                     (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[12])) ? 
                        -0.08068151f : 
                        -0.10079084f)))) : 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
                 (data[4 /* dotsCount */] <0.5f ? 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[12])) ? 
                        -0.09414462f : 
                        -0.0074702734f) : 
                     (data[4 /* dotsCount */] <1.5f ? 
                         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[5])) ? 
                             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[6])) ? 
                                0.100364864f : 
                                0.10286187f) : 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                                0.10222722f : 
                                0.084392115f)) : 
                         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[5])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[12])) ? 
                                    -0.10345912f : 
                                    0.003834757f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.039849024f : 
                                    0.02196046f)) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[12])) ? 
                                    0.039723944f : 
                                    0.104241006f) : 
                                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[6])) ? 
                                    -0.028631805f : 
                                    0.10144073f))))) : 
                 (data[4 /* dotsCount */] <2.5f ? 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[5])) ? 
                         (data[7 /* imagesAsURL */] <48.0f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <12.5f ? 
                                -0.06493898f : 
                                -0.12143772f) : 
                             (data[7 /* imagesAsURL */] <56.5f ? 
                                -0.10161569f : 
                                 (data[7 /* imagesAsURL */] <111.5f ? 
                                    -0.1044039f : 
                                    -0.10255907f))) : 
                         (data[7 /* imagesAsURL */] <15.0f ? 
                            0.027935613f : 
                            -0.068115555f)) : 
                     (data[7 /* imagesAsURL */] <15.0f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.0f ? 
                             (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[5])) ? 
                                -0.072976865f : 
                                0.009010897f) : 
                            0.05467332f) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <112.5f ? 
                             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[6])) ? 
                                 (data[7 /* imagesAsURL */] <54.5f ? 
                                    -0.06390865f : 
                                    -0.10169596f) : 
                                 (data[7 /* imagesAsURL */] <67.0f ? 
                                    0.013352549f : 
                                    -0.101983756f)) : 
                             (data[7 /* imagesAsURL */] <116.0f ? 
                                -0.107846856f : 
                                -0.10279838f))))) : 
             (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[5])) ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[6])) ? 
                        -0.0600394f : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <3.5f ? 
                                -0.028036254f : 
                                -0.10091666f) : 
                            -0.046828073f)) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <6.5f ? 
                        0.030384276f : 
                        -0.073234245f)) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.0f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <6.5f ? 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[6])) ? 
                            -0.002081458f : 
                            0.10464378f) : 
                        -0.04647134f) : 
                    -0.05882635f))));
    return pred;
  } // constant pool size = 290B, number of visited nodes = 47, static init size = 600B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_84 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_84_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_84_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[5])) ? 
                        -0.036478538f : 
                        -0.016063958f) : 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[5])) ? 
                        0.10336383f : 
                        0.04709475f)) : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                     (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[5])) ? 
                        -0.012997628f : 
                        0.007716972f) : 
                    -0.016550874f)) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[0])) ? 
                     (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[5])) ? 
                        -0.023286236f : 
                        0.01422211f) : 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[5])) ? 
                        0.022955509f : 
                        0.063319f)) : 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[0])) ? 
                    -0.13869423f : 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[5])) ? 
                        0.101507686f : 
                        0.12103839f)))) : 
         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[15])) ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                 (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[5])) ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <14.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    -0.01780992f : 
                                    -0.039856724f) : 
                                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[0])) ? 
                                    -0.100876905f : 
                                    0.03008807f)) : 
                             (data[4 /* dotsCount */] <2.5f ? 
                                 (data[7 /* imagesAsURL */] <71.5f ? 
                                    -0.116532095f : 
                                    -0.101807654f) : 
                                 (data[7 /* imagesAsURL */] <61.5f ? 
                                    -0.10493234f : 
                                    -0.10205192f))) : 
                        -0.12646085f) : 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[0])) ? 
                        -0.038512386f : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                                    0.019369094f : 
                                    0.10244633f) : 
                                -0.057168584f) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                    -0.03200007f : 
                                    0.10629523f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <5.5f ? 
                                    0.10519057f : 
                                    -0.054210734f))))) : 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[0])) ? 
                    -0.103687026f : 
                    0.056849893f)) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[0])) ? 
                     (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[5])) ? 
                        -0.114464216f : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                            -0.030230323f : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                                -0.10112108f : 
                                -0.10154527f))) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.012632092f : 
                                    0.031289294f) : 
                                -0.097605444f) : 
                             (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[5])) ? 
                                0.10092152f : 
                                0.11103297f)) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                                -0.03065449f : 
                                0.022745265f) : 
                            -0.042363428f))) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                     (data[4 /* dotsCount */] <2.5f ? 
                        -0.111907184f : 
                        -0.10085525f) : 
                     (data[4 /* dotsCount */] <2.5f ? 
                        -0.102428846f : 
                        -0.10624077f)))));
    return pred;
  } // constant pool size = 284B, number of visited nodes = 48, static init size = 540B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_85 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_85_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_85_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[9])) ? 
            -0.107600026f : 
             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[11])) ? 
                 (data[14 /* phishingTermsWeight */] <0.94951093f ? 
                    -0.11910046f : 
                    -0.1213563f) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.9946113f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.2693539f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.056602f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.5424515f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.6941032f ? 
                                    -0.003576771f : 
                                    -0.039062627f) : 
                                 (data[14 /* phishingTermsWeight */] <1.7285751f ? 
                                    0.023846941f : 
                                    0.0067797364f)) : 
                             (data[14 /* phishingTermsWeight */] <2.1728578f ? 
                                -0.13434131f : 
                                -0.10225801f)) : 
                         (data[14 /* phishingTermsWeight */] <2.5033736f ? 
                            0.075486176f : 
                            0.027694134f)) : 
                     (data[14 /* phishingTermsWeight */] <3.2548118f ? 
                        -0.15691431f : 
                         (data[14 /* phishingTermsWeight */] <3.6085217f ? 
                            0.036014784f : 
                            -0.07932688f))))) : 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.9081517f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8298877f ? 
                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[11])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.5153757f ? 
                        -0.09585821f : 
                        0.104741104f) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7727038f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3295279f ? 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                                -0.007840726f : 
                                0.059232663f) : 
                             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                                -0.037143238f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.53734f ? 
                                    0.04037217f : 
                                    -0.042679634f))) : 
                        0.048531674f)) : 
                -0.060738806f) : 
             (data[14 /* phishingTermsWeight */] <2.1406791f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.119358f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.0825202f ? 
                        0.11524723f : 
                        -0.08222767f) : 
                    0.1242185f) : 
                 (data[14 /* phishingTermsWeight */] <3.8301365f ? 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[10])) ? 
                        0.0065870993f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.302367f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.1862576f ? 
                                 (data[14 /* phishingTermsWeight */] <2.2980218f ? 
                                    -9.2135515E-4f : 
                                    0.051317483f) : 
                                 (data[14 /* phishingTermsWeight */] <3.25965f ? 
                                    -0.10312699f : 
                                    0.10101263f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5482163f ? 
                                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[11])) ? 
                                    0.10221233f : 
                                    0.103724495f) : 
                                 (data[14 /* phishingTermsWeight */] <3.670494f ? 
                                    0.033616163f : 
                                    0.09200437f)))) : 
                     (data[14 /* phishingTermsWeight */] <4.088835f ? 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[11])) ? 
                             (data[14 /* phishingTermsWeight */] <3.965119f ? 
                                0.079268515f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.038607f ? 
                                    -0.06239718f : 
                                    0.10264499f)) : 
                            0.104641095f) : 
                         (data[14 /* phishingTermsWeight */] <4.253216f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.159458f ? 
                                0.11837057f : 
                                0.09469944f) : 
                             (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[8])) ? 
                                 (data[14 /* phishingTermsWeight */] <5.017588f ? 
                                    -0.095686786f : 
                                    0.10175056f) : 
                                 (data[14 /* phishingTermsWeight */] <5.017588f ? 
                                    0.049178716f : 
                                    0.017436244f))))))));
    return pred;
  } // constant pool size = 228B, number of visited nodes = 44, static init size = 300B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_86 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_86_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_86_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[5])) ? 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.9446714f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8307258f ? 
                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.5160698f ? 
                         (data[14 /* phishingTermsWeight */] <0.83255804f ? 
                            -0.052469388f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4045854f ? 
                                -0.11969047f : 
                                -0.120270945f)) : 
                        0.05272927f) : 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3730444f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8238266f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.4737003f ? 
                                    -0.0059172623f : 
                                    0.027042763f) : 
                                 (data[14 /* phishingTermsWeight */] <0.9255433f ? 
                                    -0.0423045f : 
                                    -0.0034552338f)) : 
                             (data[14 /* phishingTermsWeight */] <1.5265509f ? 
                                0.13054164f : 
                                 (data[14 /* phishingTermsWeight */] <1.775999f ? 
                                    -0.027091164f : 
                                    0.03803207f))) : 
                        0.0139558725f)) : 
                -0.062107913f) : 
             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                -0.03316421f : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.858559f ? 
                     (data[14 /* phishingTermsWeight */] <2.1366353f ? 
                         (data[14 /* phishingTermsWeight */] <2.1199021f ? 
                            0.039376326f : 
                            0.102474995f) : 
                         (data[14 /* phishingTermsWeight */] <2.301399f ? 
                             (data[14 /* phishingTermsWeight */] <2.2133303f ? 
                                0.06971687f : 
                                -0.010430284f) : 
                             (data[14 /* phishingTermsWeight */] <3.0428352f ? 
                                 (data[14 /* phishingTermsWeight */] <2.5358422f ? 
                                    0.06062384f : 
                                    0.0681276f) : 
                                 (data[14 /* phishingTermsWeight */] <3.302338f ? 
                                    -0.030967565f : 
                                    0.053524908f)))) : 
                    -0.07535529f))) : 
         (data[14 /* phishingTermsWeight */] <2.693324f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.6248038f ? 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[9])) ? 
                    -0.17019285f : 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[10])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.5285919f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7843243f ? 
                                -0.0025432822f : 
                                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                                    -0.008307699f : 
                                    0.07447032f)) : 
                            -0.037931435f) : 
                        0.11504802f)) : 
                -0.100396514f) : 
             (data[14 /* phishingTermsWeight */] <3.0053103f ? 
                 (data[14 /* phishingTermsWeight */] <2.934322f ? 
                    0.105795234f : 
                    0.10578184f) : 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                     (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[8])) ? 
                        -0.045984223f : 
                         (data[14 /* phishingTermsWeight */] <4.5912404f ? 
                             (data[14 /* phishingTermsWeight */] <3.309323f ? 
                                -0.010558928f : 
                                 (data[14 /* phishingTermsWeight */] <3.642011f ? 
                                    0.10351178f : 
                                    0.101082265f)) : 
                             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[10])) ? 
                                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[11])) ? 
                                    -0.057380486f : 
                                    0.10090686f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <7.683804f ? 
                                    0.10094821f : 
                                    0.10050169f)))) : 
                     (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[11])) ? 
                         (data[14 /* phishingTermsWeight */] <3.2035515f ? 
                            -0.07704836f : 
                             (data[14 /* phishingTermsWeight */] <3.884376f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5299277f ? 
                                    0.03748862f : 
                                    0.11419882f) : 
                                 (data[14 /* phishingTermsWeight */] <4.077276f ? 
                                    -0.025229141f : 
                                    0.026616389f))) : 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[10])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.225612f ? 
                                0.100392245f : 
                                0.10076529f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.5427985f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.1167145f ? 
                                    0.10147413f : 
                                    0.101876624f) : 
                                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[8])) ? 
                                    0.10085671f : 
                                    0.10201185f))))))));
    return pred;
  } // constant pool size = 272B, number of visited nodes = 50, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_87 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_87_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_87_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[9])) ? 
             (data[4 /* dotsCount */] <0.5f ? 
                -0.09955509f : 
                0.10545829f) : 
             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                    0.0105757015f : 
                    0.013312746f) : 
                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                    0.039611075f : 
                    0.043112613f))) : 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[0])) ? 
                    -0.063765116f : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
                            0.0051975558f : 
                            0.02766191f) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                            -0.039695505f : 
                            -0.011006092f))) : 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[0])) ? 
                    -0.10547364f : 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[9])) ? 
                         (data[4 /* dotsCount */] <2.5f ? 
                            0.1015947f : 
                            0.100988716f) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                            -0.01216683f : 
                            0.05920801f)))) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <15.5f ? 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[9])) ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[10])) ? 
                             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[0])) ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                                    -0.056402564f : 
                                    -0.048689537f) : 
                                -0.103177525f) : 
                            0.07326765f) : 
                         (data[4 /* dotsCount */] <6.5f ? 
                            0.03380628f : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <7.5f ? 
                                -0.0845054f : 
                                0.019517107f))) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                        0.0659083f : 
                        0.10054133f)) : 
                -0.10886213f)));
    return pred;
  } // constant pool size = 167B, number of visited nodes = 25, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_88 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_88_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_88_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[11])) ? 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                -0.11443552f : 
                -0.122650735f) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                 (data[3 /* domainsCount */] <0.5f ? 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                        0.0051473835f : 
                        0.028541164f) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                            -0.08574279f : 
                            0.008274124f) : 
                         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                -0.10223646f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    -0.102653906f : 
                                    -0.10159394f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    -0.10400943f : 
                                    -0.10109477f) : 
                                -0.10212224f)))) : 
                -0.101558f)) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <28.5f ? 
             (data[3 /* domainsCount */] <1.5f ? 
                 (data[3 /* domainsCount */] <0.5f ? 
                     (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[15])) ? 
                        -0.054625478f : 
                        -0.0011958296f) : 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[11])) ? 
                            -0.015999924f : 
                            -0.010699627f) : 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[11])) ? 
                            0.0068964227f : 
                            0.1016051f))) : 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[15])) ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[8])) ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    0.0037306028f : 
                                    4.4823944E-4f) : 
                                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[11])) ? 
                                    0.10052973f : 
                                    0.021195253f)) : 
                             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[11])) ? 
                                0.100454345f : 
                                0.03677815f)) : 
                         (data[3 /* domainsCount */] <7.5f ? 
                             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[11])) ? 
                                 (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[8])) ? 
                                    -0.033714995f : 
                                    0.028815236f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                                    0.10354675f : 
                                    0.0116558f)) : 
                             (data[3 /* domainsCount */] <9.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                    0.03520389f : 
                                    0.056154322f) : 
                                 (data[3 /* domainsCount */] <10.5f ? 
                                    -0.062230464f : 
                                    0.006319232f)))) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[11])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                0.10278932f : 
                                -0.025927199f) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                0.020207364f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    0.04412883f : 
                                    0.020101063f))) : 
                         (data[3 /* domainsCount */] <5.5f ? 
                            -0.019918166f : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                 (data[3 /* domainsCount */] <6.5f ? 
                                    0.101324f : 
                                    0.09427821f) : 
                                 (data[3 /* domainsCount */] <9.5f ? 
                                    -0.013652589f : 
                                    0.04727306f)))))) : 
             (data[3 /* domainsCount */] <31.5f ? 
                -0.10243061f : 
                 (data[3 /* domainsCount */] <34.5f ? 
                    0.06004103f : 
                     (data[3 /* domainsCount */] <39.5f ? 
                        -0.100629866f : 
                        -0.05574208f)))));
    return pred;
  } // constant pool size = 271B, number of visited nodes = 46, static init size = 510B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_89 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_89_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_89_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.9127166f ? 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.0f ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.823058f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7660874f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.66228276f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.480155f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.38412398f ? 
                                    -0.0049475953f : 
                                    -0.12016676f) : 
                                0.09209124f) : 
                             (data[14 /* phishingTermsWeight */] <1.1009707f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0109394f ? 
                                    -0.031018408f : 
                                    -0.10878766f) : 
                                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[10])) ? 
                                    -0.014127861f : 
                                    7.356703E-4f))) : 
                        0.039281376f) : 
                    -0.056409176f) : 
                 (data[14 /* phishingTermsWeight */] <0.06724394f ? 
                    -0.1236998f : 
                     (data[14 /* phishingTermsWeight */] <1.0047119f ? 
                        0.17080733f : 
                        0.044353183f))) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.5f ? 
                 (data[14 /* phishingTermsWeight */] <0.11954479f ? 
                    0.13353638f : 
                    0.056415897f) : 
                -0.10349999f)) : 
         (data[14 /* phishingTermsWeight */] <2.0870051f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.0204737f ? 
                0.116123684f : 
                0.0845657f) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[6])) ? 
                     (data[14 /* phishingTermsWeight */] <2.5424168f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.216629f ? 
                            -0.019045414f : 
                            -0.09684896f) : 
                         (data[14 /* phishingTermsWeight */] <3.083151f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.9751081f ? 
                                 (data[14 /* phishingTermsWeight */] <2.9102824f ? 
                                    0.11217591f : 
                                    0.10601005f) : 
                                0.106327124f) : 
                             (data[14 /* phishingTermsWeight */] <4.3899255f ? 
                                 (data[14 /* phishingTermsWeight */] <3.1563385f ? 
                                    -0.050579533f : 
                                    0.079604626f) : 
                                 (data[14 /* phishingTermsWeight */] <4.977974f ? 
                                    -0.029853106f : 
                                    0.04296538f)))) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9037397f ? 
                             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                                 (data[14 /* phishingTermsWeight */] <2.2701523f ? 
                                    -0.1857666f : 
                                    0.06352674f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.4499655f ? 
                                    0.03959723f : 
                                    0.11094438f)) : 
                             (data[14 /* phishingTermsWeight */] <4.0611844f ? 
                                 (data[14 /* phishingTermsWeight */] <3.9854035f ? 
                                    -0.07234313f : 
                                    -0.027964963f) : 
                                 (data[14 /* phishingTermsWeight */] <4.210757f ? 
                                    0.11824305f : 
                                    0.043683454f))) : 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.72223f ? 
                                 (data[14 /* phishingTermsWeight */] <2.9045048f ? 
                                    -0.17475562f : 
                                    -0.093234256f) : 
                                0.10252139f) : 
                            -0.036904834f))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.0308065f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.086127f ? 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                             (data[14 /* phishingTermsWeight */] <2.2779906f ? 
                                 (data[7 /* imagesAsURL */] <48.0f ? 
                                    0.010930406f : 
                                    -0.10214159f) : 
                                 (data[7 /* imagesAsURL */] <15.0f ? 
                                    -0.096276015f : 
                                    -0.10342462f)) : 
                             (data[14 /* phishingTermsWeight */] <3.7559571f ? 
                                -0.10872988f : 
                                0.043980483f)) : 
                        -0.09314589f) : 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[6])) ? 
                        0.10172751f : 
                        0.10407885f)))));
    return pred;
  } // constant pool size = 216B, number of visited nodes = 46, static init size = 180B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_90 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_90_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_90_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <6.0f ? 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[10])) ? 
                         (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[6])) ? 
                                -0.034265067f : 
                                -0.0053625354f) : 
                             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[6])) ? 
                                0.023677021f : 
                                0.1090779f)) : 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[6])) ? 
                            -0.057490174f : 
                            0.06279781f)) : 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[6])) ? 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[10])) ? 
                                -0.04202218f : 
                                0.10069459f) : 
                             (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[10])) ? 
                                -0.0061639342f : 
                                0.001392221f)) : 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[9])) ? 
                            0.10163187f : 
                            0.0398336f))) : 
                 (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[15])) ? 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[6])) ? 
                        -0.0155719565f : 
                        0.10065151f) : 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[10])) ? 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[9])) ? 
                            -0.054550864f : 
                             (data[7 /* imagesAsURL */] <1.5f ? 
                                0.10055574f : 
                                0.10359472f)) : 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[6])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                0.043724947f : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                    0.0035878094f : 
                                    0.0123365745f)) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                    0.10515666f : 
                                    0.08553721f) : 
                                0.100567326f))))) : 
             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[15])) ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <13.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <10.5f ? 
                        -0.1101306f : 
                        -0.106821135f) : 
                    -0.10441106f) : 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[10])) ? 
                     (data[7 /* imagesAsURL */] <16.5f ? 
                         (data[7 /* imagesAsURL */] <13.0f ? 
                            -0.094413705f : 
                            0.0055773454f) : 
                         (data[7 /* imagesAsURL */] <48.5f ? 
                            0.0048841676f : 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[6])) ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <96.0f ? 
                                    -0.10201937f : 
                                    -0.10933253f) : 
                                 (data[7 /* imagesAsURL */] <63.5f ? 
                                    -0.10430306f : 
                                    -0.101640604f)))) : 
                     (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[9])) ? 
                        -0.0107706f : 
                        0.10054729f)))) : 
         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT20, 32, 0, data[15])) ? 
             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT21, 32, 0, data[6])) ? 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <9.0f ? 
                     (data[2 /* hexadecimalURLs */] <1.5f ? 
                        -0.111028366f : 
                         (data[2 /* hexadecimalURLs */] <2.5f ? 
                            0.10747235f : 
                            0.08652841f)) : 
                    -0.10069609f) : 
                0.1017202f) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT22, 32, 0, data[9])) ? 
                    0.10213785f : 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT23, 32, 0, data[6])) ? 
                        0.101742476f : 
                        0.096526414f)) : 
                -0.05356459f)));
    return pred;
  } // constant pool size = 294B, number of visited nodes = 43, static init size = 720B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT20 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT21 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT22 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT23 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_91 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_91_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_91_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <8.5f ? 
         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[12])) ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.6014757f ? 
                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.2479956f ? 
                         (data[14 /* phishingTermsWeight */] <0.3561243f ? 
                            -0.101027556f : 
                            -0.10155283f) : 
                         (data[14 /* phishingTermsWeight */] <2.1949494f ? 
                            -0.10619583f : 
                            -0.10888126f)) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.8717859f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.2160051f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.28136045f ? 
                                -0.10175149f : 
                                -0.1038641f) : 
                            0.020727843f) : 
                        -0.04357159f)) : 
                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[6])) ? 
                     (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.100201145f : 
                        0.10102054f) : 
                    0.105946526f)) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.1181397f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.085044f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.9547286f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8569921f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7641425f ? 
                                    -0.0071343477f : 
                                    0.029261736f) : 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                    -0.07391127f : 
                                    0.0011748183f)) : 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[6])) ? 
                                0.07947122f : 
                                0.11294282f)) : 
                        -0.08989633f) : 
                     (data[14 /* phishingTermsWeight */] <3.562289f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5174494f ? 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[6])) ? 
                                 (data[14 /* phishingTermsWeight */] <2.4749303f ? 
                                    0.10845857f : 
                                    -0.003922888f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.6139328f ? 
                                    0.038774613f : 
                                    0.036080375f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5250127f ? 
                                0.11310638f : 
                                0.15173332f)) : 
                         (data[14 /* phishingTermsWeight */] <4.103845f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.9422207f ? 
                                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[6])) ? 
                                    0.10132584f : 
                                    0.07085395f) : 
                                 (data[14 /* phishingTermsWeight */] <3.9809036f ? 
                                    -0.06416056f : 
                                    0.006780046f)) : 
                             (data[14 /* phishingTermsWeight */] <4.29339f ? 
                                 (data[14 /* phishingTermsWeight */] <4.2651706f ? 
                                    0.11971622f : 
                                    0.10113561f) : 
                                 (data[14 /* phishingTermsWeight */] <4.833592f ? 
                                    0.061786216f : 
                                    0.009533184f))))) : 
                 (data[14 /* phishingTermsWeight */] <1.0225502f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.63110524f ? 
                        0.01852078f : 
                         (data[14 /* phishingTermsWeight */] <0.8491484f ? 
                            0.1318124f : 
                            0.16364104f)) : 
                     (data[14 /* phishingTermsWeight */] <3.3746865f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.054507f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                0.03829079f : 
                                -0.038395032f) : 
                             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[6])) ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[15])) ? 
                                    -0.1514266f : 
                                    -0.009960294f) : 
                                0.104566835f)) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <6.0f ? 
                             (data[14 /* phishingTermsWeight */] <4.235734f ? 
                                 (data[14 /* phishingTermsWeight */] <3.8778532f ? 
                                    0.09058807f : 
                                    0.102645375f) : 
                                 (data[14 /* phishingTermsWeight */] <4.6016345f ? 
                                    -0.060089633f : 
                                    0.090040304f)) : 
                            0.107198164f))))) : 
         (data[14 /* phishingTermsWeight */] <2.182049f ? 
            0.061521403f : 
             (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                 (data[7 /* imagesAsURL */] <16.5f ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[15])) ? 
                        -0.08996213f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                            -0.101065494f : 
                            -0.10573031f)) : 
                     (data[7 /* imagesAsURL */] <36.5f ? 
                         (data[14 /* phishingTermsWeight */] <3.6565096f ? 
                            -0.102142446f : 
                            -0.013518262f) : 
                         (data[14 /* phishingTermsWeight */] <2.833795f ? 
                            -0.1020936f : 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[6])) ? 
                                -0.10496552f : 
                                -0.10623596f)))) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.1697664f ? 
                     (data[7 /* imagesAsURL */] <52.0f ? 
                        -0.10840267f : 
                         (data[14 /* phishingTermsWeight */] <2.4772458f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <112.5f ? 
                                -0.10107647f : 
                                -0.10211956f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.331955f ? 
                                -0.10074168f : 
                                -0.10125524f))) : 
                    -0.04520289f))));
    return pred;
  } // constant pool size = 303B, number of visited nodes = 59, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_92 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_92_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_92_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.54779476f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.28031686f ? 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
                        7.007722E-4f : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.04379951f ? 
                            0.021363527f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.13375893f ? 
                                -0.10042709f : 
                                -0.1015636f))) : 
                    0.0914362f) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7113085f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.1829766f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9609261f ? 
                             (data[14 /* phishingTermsWeight */] <0.891656f ? 
                                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                                    -0.019792838f : 
                                    0.048999302f) : 
                                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                                    -0.10763829f : 
                                    -0.10210062f)) : 
                            0.1868803f) : 
                         (data[14 /* phishingTermsWeight */] <1.2719828f ? 
                            -0.023992788f : 
                            -0.11189257f)) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.5953903f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.1569862f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7760398f ? 
                                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                                    0.018449895f : 
                                    0.10760692f) : 
                                -0.040261716f) : 
                            0.090562195f) : 
                         (data[14 /* phishingTermsWeight */] <3.191508f ? 
                            -0.07561943f : 
                             (data[14 /* phishingTermsWeight */] <4.5558047f ? 
                                -0.020760024f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.309758f ? 
                                    0.102236636f : 
                                    0.10041607f)))))) : 
             (data[14 /* phishingTermsWeight */] <1.9538013f ? 
                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.99216473f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.43407208f ? 
                            -0.104148254f : 
                            -0.10501979f) : 
                        0.13370378f) : 
                    0.075676315f) : 
                 (data[14 /* phishingTermsWeight */] <2.5571775f ? 
                    -0.08739393f : 
                     (data[14 /* phishingTermsWeight */] <4.0583663f ? 
                         (data[14 /* phishingTermsWeight */] <3.2665386f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.0045369f ? 
                                0.10268331f : 
                                0.10591124f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8020916f ? 
                                 (data[14 /* phishingTermsWeight */] <3.369898f ? 
                                    0.10038697f : 
                                    0.10066509f) : 
                                0.10544909f)) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.1373453f ? 
                             (data[14 /* phishingTermsWeight */] <4.5697002f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.31426f ? 
                                    0.10019879f : 
                                    0.10044056f) : 
                                 (data[14 /* phishingTermsWeight */] <4.818091f ? 
                                    0.10093649f : 
                                    0.100677386f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.826693f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.538199f ? 
                                    0.100266136f : 
                                    0.100242116f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <6.4471064f ? 
                                    0.1001098f : 
                                    0.10018124f))))))) : 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.1181397f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.085044f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.9140052f ? 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[0])) ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7943798f ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.2560658f ? 
                                    -0.010781902f : 
                                    0.023566168f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.85233045f ? 
                                    -9.271163E-4f : 
                                    -0.059251945f)) : 
                            -0.043105833f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.6747545f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.507279f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.1304593f ? 
                                    -0.07963528f : 
                                    -0.01420588f) : 
                                0.12215078f) : 
                             (data[14 /* phishingTermsWeight */] <1.7507788f ? 
                                -0.1128728f : 
                                 (data[14 /* phishingTermsWeight */] <1.8390212f ? 
                                    -0.102421045f : 
                                    -0.10079237f)))) : 
                    0.09214442f) : 
                -0.113624685f) : 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[0])) ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.5304232f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.2724047f ? 
                         (data[14 /* phishingTermsWeight */] <2.1746347f ? 
                            -0.1019539f : 
                            -0.1018907f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.2498586f ? 
                             (data[4 /* dotsCount */] <2.5f ? 
                                -0.10841727f : 
                                -0.10465115f) : 
                            -0.11128049f)) : 
                    0.016261121f) : 
                 (data[14 /* phishingTermsWeight */] <2.174631f ? 
                    0.11873135f : 
                     (data[14 /* phishingTermsWeight */] <3.856131f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                             (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.413435f ? 
                                    -0.024648637f : 
                                    -0.10635033f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.332133f ? 
                                    0.029512178f : 
                                    0.097772986f)) : 
                             (data[14 /* phishingTermsWeight */] <2.4784627f ? 
                                -0.13506803f : 
                                0.004470711f)) : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.5f ? 
                             (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[8])) ? 
                                 (data[14 /* phishingTermsWeight */] <4.9567866f ? 
                                    -0.07986731f : 
                                    0.10157792f) : 
                                 (data[14 /* phishingTermsWeight */] <4.133241f ? 
                                    -0.00783303f : 
                                    0.03779188f)) : 
                             (data[14 /* phishingTermsWeight */] <5.643075f ? 
                                -0.056328285f : 
                                0.10047031f)))))));
    return pred;
  } // constant pool size = 323B, number of visited nodes = 69, static init size = 270B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_93 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_93_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_93_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[12])) ? 
                    -0.09216524f : 
                     (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[5])) ? 
                         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[6])) ? 
                            -0.0445574f : 
                            0.101994164f) : 
                        -0.0016723154f)) : 
                 (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[12])) ? 
                    -0.11583612f : 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[5])) ? 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[6])) ? 
                            0.002280281f : 
                            0.014127604f) : 
                        0.026569795f))) : 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[0])) ? 
                -0.05003187f : 
                 (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[5])) ? 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[10])) ? 
                        0.100472644f : 
                        0.10242173f) : 
                    0.07325002f))) : 
         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[0])) ? 
             (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[5])) ? 
                -0.05979899f : 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[10])) ? 
                    -0.10299107f : 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[6])) ? 
                         (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[12])) ? 
                            -0.070547216f : 
                            -0.10043554f) : 
                        0.003705631f))) : 
             (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[10])) ? 
                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[6])) ? 
                     (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[12])) ? 
                        -0.038464952f : 
                        -0.0011329739f) : 
                    0.01815973f) : 
                 (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[12])) ? 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[6])) ? 
                        -0.06712762f : 
                         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT20, 32, 0, data[5])) ? 
                            0.06829881f : 
                            0.024593854f)) : 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT21, 32, 0, data[6])) ? 
                        0.10086219f : 
                        0.081968985f)))));
    return pred;
  } // constant pool size = 208B, number of visited nodes = 24, static init size = 660B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT20 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT21 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_94 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_94_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_94_class_0 {
  static final double score0(double[] data) {
    double pred =      (data[4 /* dotsCount */] <1.5f ? 
         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[12])) ? 
             (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[5])) ? 
                -0.10591003f : 
                -0.10241656f) : 
            0.010922069f) : 
         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[6])) ? 
                -0.005018326f : 
                 (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[5])) ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                             (data[3 /* domainsCount */] <1.5f ? 
                                0.041665867f : 
                                0.015415661f) : 
                             (data[3 /* domainsCount */] <3.5f ? 
                                -0.13548142f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                    0.09185415f : 
                                    0.06482492f))) : 
                         (data[3 /* domainsCount */] <3.5f ? 
                            -0.081422485f : 
                             (data[3 /* domainsCount */] <9.5f ? 
                                0.058512367f : 
                                 (data[3 /* domainsCount */] <13.5f ? 
                                    -0.10078151f : 
                                    -0.014212366f)))) : 
                     (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                         (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[12])) ? 
                            0.10070919f : 
                            0.10058355f) : 
                        0.08156176f))) : 
             (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[5])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <19.5f ? 
                     (data[3 /* domainsCount */] <1.5f ? 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[6])) ? 
                            -0.058476247f : 
                            -0.10891689f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                             (data[3 /* domainsCount */] <2.5f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.0f ? 
                                    0.037295956f : 
                                    -0.015563479f) : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <6.5f ? 
                                    0.10717115f : 
                                    -0.04184838f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <6.5f ? 
                                -0.13059525f : 
                                -0.009751361f))) : 
                    -0.10075589f) : 
                 (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                    -0.016581288f : 
                    0.1005259f))));
    return pred;
  } // constant pool size = 151B, number of visited nodes = 26, static init size = 270B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_95 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_95_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_95_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
        -0.008902313f : 
         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                     (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[8])) ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <5.5f ? 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                -0.005047525f : 
                                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                                    0.099338606f : 
                                    0.030565333f)) : 
                            0.036324725f) : 
                        0.029797532f) : 
                    0.026242355f) : 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[10])) ? 
                    -0.015728742f : 
                     (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[8])) ? 
                        0.10109931f : 
                        0.03831948f))) : 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                -0.014145978f : 
                0.005120455f)));
    return pred;
  } // constant pool size = 86B, number of visited nodes = 11, static init size = 240B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_96 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_96_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_96_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <6.0f ? 
             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[8])) ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                     (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[6])) ? 
                         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                            -0.0021787868f : 
                             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[9])) ? 
                                0.10076912f : 
                                0.030259121f)) : 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                            -0.0708426f : 
                             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[9])) ? 
                                0.015287551f : 
                                0.10825923f))) : 
                     (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[10])) ? 
                         (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[9])) ? 
                            -0.05137523f : 
                             (data[7 /* imagesAsURL */] <1.5f ? 
                                0.10041138f : 
                                0.10234898f)) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                             (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[6])) ? 
                                0.012565276f : 
                                0.10436151f) : 
                             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                    0.0810625f : 
                                    0.10058901f) : 
                                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                                    0.027270008f : 
                                    0.026970366f))))) : 
                 (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                    -0.093154475f : 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[9])) ? 
                        -0.042699557f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                            0.08836399f : 
                            0.10268143f)))) : 
             (data[7 /* imagesAsURL */] <13.5f ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[10])) ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <9.5f ? 
                            -0.09240509f : 
                            -0.10203436f) : 
                        -0.10702779f) : 
                    0.106392264f) : 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[10])) ? 
                    -0.0900248f : 
                     (data[7 /* imagesAsURL */] <35.0f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <21.5f ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <16.5f ? 
                                -0.003996865f : 
                                -0.1050282f) : 
                            0.015841814f) : 
                         (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[6])) ? 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <87.0f ? 
                                -0.1018165f : 
                                -0.10830416f) : 
                             (data[7 /* imagesAsURL */] <53.5f ? 
                                -0.10100204f : 
                                 (data[7 /* imagesAsURL */] <100.5f ? 
                                    -0.10271816f : 
                                    -0.10158765f))))))) : 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <4.0f ? 
             (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[6])) ? 
                 (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[9])) ? 
                    0.10012984f : 
                    0.1016748f) : 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                            0.0032042507f : 
                            0.071715474f) : 
                         (data[2 /* hexadecimalURLs */] <3.5f ? 
                            0.09933044f : 
                            0.0764187f)) : 
                    0.106492065f)) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <16.5f ? 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <9.0f ? 
                    -0.017384583f : 
                    -0.103061244f) : 
                -0.10414616f)));
    return pred;
  } // constant pool size = 251B, number of visited nodes = 41, static init size = 510B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_97 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_97_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_97_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4927408f ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.79142135f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.28132555f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.16703704f ? 
                         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.041551247f ? 
                                    0.01731724f : 
                                    -0.10030749f) : 
                                -0.103564754f) : 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                                0.0011449853f : 
                                0.1220304f)) : 
                        -0.104737535f) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.48551002f ? 
                        0.06595844f : 
                        0.08898155f)) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.98786056f ? 
                     (data[14 /* phishingTermsWeight */] <0.8913373f ? 
                         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                            -0.052776355f : 
                            0.048188016f) : 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                                -0.10683756f : 
                                -0.036286913f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9671871f ? 
                                -0.10211964f : 
                                -0.100258134f))) : 
                     (data[14 /* phishingTermsWeight */] <1.1841602f ? 
                        0.14344122f : 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[0])) ? 
                                -0.029522741f : 
                                -0.024989938f) : 
                            0.102089606f)))) : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3477104f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.1792465f ? 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[0])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.35377395f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.31839657f ? 
                                    -0.012678974f : 
                                    -0.09979876f) : 
                                 (data[14 /* phishingTermsWeight */] <0.702589f ? 
                                    0.10617303f : 
                                    -0.010382866f)) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.14740582f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.066332616f ? 
                                    -0.06572401f : 
                                    -0.100134574f) : 
                                 (data[14 /* phishingTermsWeight */] <0.8663824f ? 
                                    -0.101122424f : 
                                    -0.1005535f))) : 
                         (data[14 /* phishingTermsWeight */] <1.2271101f ? 
                            0.10996921f : 
                             (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[0])) ? 
                                -0.100356996f : 
                                0.0223206f))) : 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[0])) ? 
                        -0.11800061f : 
                        -0.10031595f)) : 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                     (data[14 /* phishingTermsWeight */] <0.103228875f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <3.5f ? 
                             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[0])) ? 
                                -0.009677843f : 
                                -0.10075851f) : 
                             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[0])) ? 
                                -0.100568905f : 
                                0.045683853f)) : 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[0])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.3042287f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.9503562f ? 
                                    -0.048502248f : 
                                    -0.08186029f) : 
                                -0.02509456f) : 
                             (data[14 /* phishingTermsWeight */] <1.2708676f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.97769594f ? 
                                    -0.10103129f : 
                                    -0.14448586f) : 
                                -0.10060834f))) : 
                     (data[4 /* dotsCount */] <6.5f ? 
                        0.064514466f : 
                        -0.10708741f)))) : 
         (data[14 /* phishingTermsWeight */] <1.6308396f ? 
            0.06328916f : 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[0])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.958016f ? 
                         (data[4 /* dotsCount */] <1.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.4504154f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7945291f ? 
                                    0.015663052f : 
                                    -0.012651055f) : 
                                0.0642365f) : 
                             (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[5])) ? 
                                -0.11050645f : 
                                 (data[14 /* phishingTermsWeight */] <2.0131578f ? 
                                    -0.101900995f : 
                                    -0.11580081f))) : 
                         (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[5])) ? 
                            -0.13482223f : 
                            0.011888516f)) : 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[5])) ? 
                         (data[4 /* dotsCount */] <0.5f ? 
                             (data[14 /* phishingTermsWeight */] <2.4033241f ? 
                                 (data[14 /* phishingTermsWeight */] <1.7780609f ? 
                                    0.10711577f : 
                                    0.10577785f) : 
                                 (data[14 /* phishingTermsWeight */] <4.325028f ? 
                                    -0.19829395f : 
                                    0.101592764f)) : 
                             (data[14 /* phishingTermsWeight */] <2.0174515f ? 
                                -0.029021405f : 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    0.054390628f : 
                                    -0.02231563f))) : 
                         (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                             (data[4 /* dotsCount */] <2.5f ? 
                                 (data[14 /* phishingTermsWeight */] <3.1750693f ? 
                                    -0.10154559f : 
                                    -0.088266216f) : 
                                 (data[14 /* phishingTermsWeight */] <2.4033241f ? 
                                    0.05029522f : 
                                    -0.047473732f)) : 
                             (data[4 /* dotsCount */] <0.5f ? 
                                -0.05953427f : 
                                 (data[14 /* phishingTermsWeight */] <1.8512465f ? 
                                    0.05817027f : 
                                    0.031914223f))))) : 
                 (data[14 /* phishingTermsWeight */] <2.5058215f ? 
                     (data[14 /* phishingTermsWeight */] <1.9525899f ? 
                        -0.12133765f : 
                        -0.07733099f) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <10.5f ? 
                         (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[5])) ? 
                            -0.078556016f : 
                             (data[14 /* phishingTermsWeight */] <5.414185f ? 
                                0.08644682f : 
                                 (data[14 /* phishingTermsWeight */] <7.3816075f ? 
                                    0.025407102f : 
                                    0.10033586f))) : 
                        -0.093427725f)))));
    return pred;
  } // constant pool size = 370B, number of visited nodes = 72, static init size = 480B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_98 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_98_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_98_class_0 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[0])) ? 
         (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[6])) ? 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[9])) ? 
                -0.1057716f : 
                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[11])) ? 
                     (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                        -0.11547689f : 
                        -0.12497821f) : 
                    -0.0073232492f)) : 
            0.016817844f) : 
         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[15])) ? 
             (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[9])) ? 
                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[11])) ? 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[6])) ? 
                        -0.0332357f : 
                        7.0933707E-4f) : 
                     (!Double.isNaN(data[6 /* isDearTeam */]) && (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[6])) ? 
                        0.1014435f : 
                        0.04224665f)) : 
                 (Double.isNaN(data[6 /* isDearTeam */]) || !GenModel.bitSetIsInRange(32, 0, data[6]) || (GenModel.bitSetIsInRange(32, 0, data[6]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[6])) ? 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[11])) ? 
                        -0.0023076467f : 
                        0.01512369f) : 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[11])) ? 
                        0.10028742f : 
                        0.106555566f))) : 
            0.0044057276f));
    return pred;
  } // constant pool size = 119B, number of visited nodes = 13, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_99 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_99_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_99_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                     (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[5])) ? 
                        -0.019062184f : 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[10])) ? 
                            -0.055789024f : 
                            -0.008868895f)) : 
                     (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[5])) ? 
                        0.003762226f : 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[11])) ? 
                            0.10015833f : 
                            0.1562185f))) : 
                 (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[5])) ? 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                        0.1006249f : 
                         (data[4 /* dotsCount */] <0.5f ? 
                            0.034820247f : 
                            -0.05321048f)) : 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                        0.015505197f : 
                        0.07745066f))) : 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[15])) ? 
                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[11])) ? 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[10])) ? 
                        -0.022022456f : 
                         (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[5])) ? 
                            -0.022821153f : 
                            0.063459955f)) : 
                     (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[5])) ? 
                        -0.051848482f : 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[10])) ? 
                            0.100434855f : 
                            0.1014153f))) : 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[10])) ? 
                     (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[11])) ? 
                         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[5])) ? 
                            -0.02723537f : 
                            -0.012306001f) : 
                        0.100226566f) : 
                    0.007347704f))) : 
         (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[15])) ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <4.0f ? 
                 (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[5])) ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                         (data[2 /* hexadecimalURLs */] <1.5f ? 
                            -0.1182795f : 
                            0.105252594f) : 
                        -0.054429665f) : 
                    0.10059377f) : 
                -0.12603597f) : 
             (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[5])) ? 
                 (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[10])) ? 
                    -0.0142822955f : 
                    0.10519782f) : 
                 (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <6.5f ? 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <1.5f ? 
                         (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                            0.15702221f : 
                            -0.063680485f) : 
                        -0.030594554f) : 
                    0.026965575f))));
    return pred;
  } // constant pool size = 226B, number of visited nodes = 31, static init size = 600B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_100 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_100_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_100_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.9127166f ? 
         (data[4 /* dotsCount */] <2.0f ? 
             (Double.isNaN(data[4]) || data[4 /* dotsCount */] <0.5f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.7919842f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.27843195f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.04350499f ? 
                            0.009005806f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.13358222f ? 
                                -0.10148804f : 
                                -0.10426013f)) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.48379195f ? 
                            0.05735921f : 
                            0.084681906f)) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7230086f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.2748529f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.0840253f ? 
                                 (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[12])) ? 
                                    -0.052026577f : 
                                    -0.10030903f) : 
                                0.015876314f) : 
                            -0.1050637f) : 
                        0.008831525f)) : 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.94888675f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.84510225f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.026409445f ? 
                            0.019833041f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.5663716f ? 
                                0.0830735f : 
                                0.010231067f)) : 
                        -0.039993055f) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7618859f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.2908596f ? 
                            0.10827295f : 
                            0.12477275f) : 
                        0.103414856f))) : 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8305296f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.766175f ? 
                     (Double.isNaN(data[4]) || data[4 /* dotsCount */] <5.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.7109821f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.625433f ? 
                                 (Double.isNaN(data[4]) || data[4 /* dotsCount */] <2.5f ? 
                                    -0.010870494f : 
                                    -0.03149223f) : 
                                0.08586885f) : 
                            -0.0730575f) : 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.85549104f ? 
                            0.06249101f : 
                            -0.032170385f)) : 
                    0.056609288f) : 
                -0.04695599f)) : 
         (data[14 /* phishingTermsWeight */] <2.0870051f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.0204737f ? 
                0.11415958f : 
                0.071872644f) : 
             (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[9])) ? 
                 (data[14 /* phishingTermsWeight */] <2.2572088f ? 
                    -0.15807836f : 
                     (data[14 /* phishingTermsWeight */] <3.2544963f ? 
                         (data[14 /* phishingTermsWeight */] <2.8432872f ? 
                            0.078457646f : 
                            0.10296156f) : 
                         (data[14 /* phishingTermsWeight */] <3.5401776f ? 
                            -0.05154645f : 
                             (data[14 /* phishingTermsWeight */] <4.1210628f ? 
                                0.102333546f : 
                                 (data[14 /* phishingTermsWeight */] <4.9052577f ? 
                                    -0.04611043f : 
                                    0.04439514f))))) : 
                 (data[14 /* phishingTermsWeight */] <2.2004743f ? 
                    0.05594787f : 
                     (data[14 /* phishingTermsWeight */] <3.535067f ? 
                         (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.336386f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.9510608f ? 
                                    -0.10240059f : 
                                    -0.10036984f) : 
                                -0.1072f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.4688401f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.280093f ? 
                                    0.006597047f : 
                                    0.062691845f) : 
                                 (data[14 /* phishingTermsWeight */] <3.516102f ? 
                                    0.09537292f : 
                                    0.11543897f))) : 
                         (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[8])) ? 
                            -0.030747073f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.4969187f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.110554f ? 
                                    0.013596697f : 
                                    -0.050184246f) : 
                                 (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[12])) ? 
                                    0.05395986f : 
                                    0.10522019f))))))));
    return pred;
  } // constant pool size = 211B, number of visited nodes = 46, static init size = 150B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_101 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_101_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_101_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[8])) ? 
         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[11])) ? 
                -0.0023745731f : 
                 (!Double.isNaN(data[1 /* scriptTag */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                    -0.08160822f : 
                     (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[5])) ? 
                        -0.033714477f : 
                        0.10114585f))) : 
            0.001614846f) : 
         (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[5])) ? 
            0.003858234f : 
             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                0.101241894f : 
                0.04521996f)));
    return pred;
  } // constant pool size = 65B, number of visited nodes = 7, static init size = 210B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_102 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_102_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_102_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <5.5f ? 
         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <0.5f ? 
             (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[1])) ? 
                 (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[11])) ? 
                        -0.118275575f : 
                         (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[10])) ? 
                            -0.011163545f : 
                            -0.005252659f)) : 
                     (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[10])) ? 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[11])) ? 
                            0.0017343353f : 
                            0.028363114f) : 
                        0.02054473f)) : 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[10])) ? 
                    0.10325303f : 
                    0.10274111f)) : 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[0])) ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                    -0.101310074f : 
                    -0.102354914f) : 
                 (!Double.isNaN(data[10 /* isBankTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[10])) ? 
                     (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[11])) ? 
                            -0.035177585f : 
                            0.10016318f) : 
                        0.10165474f) : 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <2.5f ? 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[11])) ? 
                            0.103808254f : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <1.5f ? 
                                0.038673446f : 
                                0.040742964f)) : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <3.5f ? 
                            0.009233262f : 
                            0.015169335f))))) : 
         (Double.isNaN(data[10 /* isBankTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[10]) || (GenModel.bitSetIsInRange(32, 0, data[10]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[10])) ? 
             (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                 (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <21.5f ? 
                     (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <11.5f ? 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <9.5f ? 
                             (data[7 /* imagesAsURL */] <8.5f ? 
                                -0.07920474f : 
                                -0.10456158f) : 
                            -0.101930365f) : 
                         (data[7 /* imagesAsURL */] <15.5f ? 
                            -0.114166215f : 
                            -0.103979215f)) : 
                     (data[7 /* imagesAsURL */] <47.5f ? 
                        -0.015542784f : 
                         (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <105.5f ? 
                             (data[7 /* imagesAsURL */] <67.0f ? 
                                -0.10345421f : 
                                -0.10174366f) : 
                            -0.10519766f))) : 
                 (data[7 /* imagesAsURL */] <21.5f ? 
                    0.043700296f : 
                     (data[7 /* imagesAsURL */] <52.5f ? 
                        -0.103829935f : 
                         (data[7 /* imagesAsURL */] <104.5f ? 
                             (data[7 /* imagesAsURL */] <78.0f ? 
                                -0.10076846f : 
                                 (data[7 /* imagesAsURL */] <84.0f ? 
                                    -0.10064808f : 
                                    -0.100745775f)) : 
                             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <128.5f ? 
                                 (data[7 /* imagesAsURL */] <116.0f ? 
                                    -0.1006429f : 
                                    -0.10143376f) : 
                                -0.10118051f))))) : 
             (Double.isNaN(data[7]) || data[7 /* imagesAsURL */] <17.5f ? 
                 (Double.isNaN(data[1 /* scriptTag */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                    0.10038435f : 
                    0.060428597f) : 
                -0.0947635f)));
    return pred;
  } // constant pool size = 225B, number of visited nodes = 37, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_103 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_103_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_103_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.9127166f ? 
         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <2.5f ? 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.8233856f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                         (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.1775624f ? 
                                    -0.012279131f : 
                                    0.004965988f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8152355f ? 
                                    0.03846511f : 
                                    -0.030516755f)) : 
                             (data[14 /* phishingTermsWeight */] <0.13587257f ? 
                                -0.11877705f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    0.16053936f : 
                                    -0.029224597f))) : 
                         (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[15])) ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.7246538f ? 
                                    -0.086482204f : 
                                    0.06352683f) : 
                                0.1244924f) : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4945984f ? 
                                0.11163741f : 
                                0.022570286f))) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                         (data[3 /* domainsCount */] <1.5f ? 
                            0.0019494263f : 
                            -0.098508075f) : 
                        0.049551986f)) : 
                 (data[14 /* phishingTermsWeight */] <1.1562933f ? 
                    0.04862334f : 
                    0.10674921f)) : 
             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[15])) ? 
                0.0042897197f : 
                0.106133044f)) : 
         (data[14 /* phishingTermsWeight */] <2.0870051f ? 
             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.0204737f ? 
                0.112748384f : 
                0.06704207f) : 
             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <9.5f ? 
                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8457768f ? 
                     (data[14 /* phishingTermsWeight */] <2.116098f ? 
                        -0.07185086f : 
                         (data[14 /* phishingTermsWeight */] <2.221896f ? 
                             (!Double.isNaN(data[15 /* domainSender */]) && (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[15])) ? 
                                 (data[14 /* phishingTermsWeight */] <2.134509f ? 
                                    0.05180228f : 
                                    0.026369985f) : 
                                 (data[14 /* phishingTermsWeight */] <2.1321473f ? 
                                    0.101338506f : 
                                    0.09331499f)) : 
                             (data[3 /* domainsCount */] <1.5f ? 
                                 (data[14 /* phishingTermsWeight */] <2.3927977f ? 
                                    -0.14474164f : 
                                    0.03124782f) : 
                                 (data[3 /* domainsCount */] <2.5f ? 
                                    0.06188896f : 
                                    0.00873838f)))) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
                         (data[3 /* domainsCount */] <0.5f ? 
                             (data[14 /* phishingTermsWeight */] <4.5543447f ? 
                                -0.07032293f : 
                                0.1017171f) : 
                             (data[14 /* phishingTermsWeight */] <4.250673f ? 
                                 (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[15])) ? 
                                    0.008503452f : 
                                    0.11912948f) : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    0.08192484f : 
                                    -0.009435784f))) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.5f ? 
                             (data[14 /* phishingTermsWeight */] <4.0581717f ? 
                                -0.22326754f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.145983f ? 
                                    0.06776578f : 
                                    -0.11452919f)) : 
                             (Double.isNaN(data[15 /* domainSender */]) || !GenModel.bitSetIsInRange(32, 0, data[15]) || (GenModel.bitSetIsInRange(32, 0, data[15]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[15])) ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <8.5f ? 
                                    0.006096139f : 
                                    -0.027712684f) : 
                                0.11042198f)))) : 
                 (data[14 /* phishingTermsWeight */] <2.682718f ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.5057378f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.3003623f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <28.5f ? 
                                0.07479549f : 
                                -0.10076156f) : 
                            -0.10139526f) : 
                        0.06567468f) : 
                     (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <5.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.59923f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <4.3111553f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <3.8388615f ? 
                                    -0.051501274f : 
                                    0.05493285f) : 
                                 (data[14 /* phishingTermsWeight */] <4.615638f ? 
                                    -0.10559376f : 
                                    -0.07332043f)) : 
                             (Double.isNaN(data[2]) || data[2 /* hexadecimalURLs */] <0.5f ? 
                                0.088721685f : 
                                0.100377284f)) : 
                        -0.09298708f)))));
    return pred;
  } // constant pool size = 235B, number of visited nodes = 52, static init size = 150B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_104 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_104_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_104_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.4014416f ? 
         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <1.349435f ? 
             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[11])) ? 
                -0.07320467f : 
                 (Double.isNaN(data[9 /* isLoginTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[9]) || (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[9])) ? 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8117695f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.46930423f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.31932133f ? 
                                    -0.0058208723f : 
                                    -0.06454756f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.26426592f ? 
                                    0.019402135f : 
                                    0.12782365f)) : 
                             (data[14 /* phishingTermsWeight */] <0.74851197f ? 
                                0.11329974f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    -0.0049849725f : 
                                    0.06080808f))) : 
                         (data[14 /* phishingTermsWeight */] <0.9256596f ? 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <5.5f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    -0.04683239f : 
                                    -0.06919701f) : 
                                0.1649738f) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <7.0f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                    0.0038591851f : 
                                    -0.08066775f) : 
                                 (data[3 /* domainsCount */] <9.5f ? 
                                    0.11855356f : 
                                    0.08588345f)))) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <0.8117695f ? 
                        0.025240049f : 
                        0.1104841f))) : 
            -0.115603626f) : 
         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <4.5f ? 
             (data[14 /* phishingTermsWeight */] <1.5256226f ? 
                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[11])) ? 
                    -0.11631917f : 
                    0.12902728f) : 
                 (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[5])) ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[11])) ? 
                             (data[14 /* phishingTermsWeight */] <3.5900276f ? 
                                -0.07648307f : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.527147f ? 
                                    0.10078349f : 
                                    0.10029638f)) : 
                             (data[14 /* phishingTermsWeight */] <2.3601108f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.0680056f ? 
                                    0.026119443f : 
                                    0.11109099f) : 
                                 (data[14 /* phishingTermsWeight */] <2.8116343f ? 
                                    -0.0629024f : 
                                    0.058448523f))) : 
                         (data[14 /* phishingTermsWeight */] <2.1295013f ? 
                            -0.13273947f : 
                             (data[14 /* phishingTermsWeight */] <3.2825484f ? 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                                    -0.10525609f : 
                                    0.10277019f) : 
                                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[11])) ? 
                                    0.100741506f : 
                                    0.077898346f)))) : 
                     (data[3 /* domainsCount */] <0.5f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.1764197f ? 
                            -0.106489494f : 
                            0.046956502f) : 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
                             (data[14 /* phishingTermsWeight */] <1.7098337f ? 
                                0.16707417f : 
                                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                                    -0.0058868043f : 
                                    0.04953548f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <3.5f ? 
                                 (data[14 /* phishingTermsWeight */] <1.7098337f ? 
                                    -0.10440624f : 
                                    0.0092788115f) : 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.897507f ? 
                                    0.0034899113f : 
                                    0.058457356f)))))) : 
             (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                 (data[14 /* phishingTermsWeight */] <3.2020671f ? 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <42.5f ? 
                         (data[3 /* domainsCount */] <6.5f ? 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.833795f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.266482f ? 
                                    0.051024944f : 
                                    0.10834578f) : 
                                -0.0350426f) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <24.0f ? 
                                 (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <2.567867f ? 
                                    -0.008754548f : 
                                    0.07132693f) : 
                                -0.10069817f)) : 
                        -0.10145306f) : 
                     (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.9722247f ? 
                         (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.113522f ? 
                             (data[14 /* phishingTermsWeight */] <3.318834f ? 
                                 (data[3 /* domainsCount */] <7.5f ? 
                                    -0.1283855f : 
                                    -0.11243464f) : 
                                 (data[14 /* phishingTermsWeight */] <3.9440842f ? 
                                    0.021786591f : 
                                    -0.06889024f)) : 
                             (data[14 /* phishingTermsWeight */] <5.2448344f ? 
                                -0.1610254f : 
                                -0.053735897f)) : 
                         (data[14 /* phishingTermsWeight */] <6.664764f ? 
                            0.10308009f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <7.5996923f ? 
                                0.10042719f : 
                                0.10029313f)))) : 
                 (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[5])) ? 
                     (!Double.isNaN(data[9 /* isLoginTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[9]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[9])) ? 
                        0.10046304f : 
                         (data[14 /* phishingTermsWeight */] <4.133425f ? 
                            0.10173323f : 
                             (Double.isNaN(data[14]) || data[14 /* phishingTermsWeight */] <5.237015f ? 
                                0.10056482f : 
                                0.10125777f))) : 
                    0.070149325f))));
    return pred;
  } // constant pool size = 291B, number of visited nodes = 61, static init size = 270B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
}


class GBM_grid__1_AutoML_20210523_175248_model_15_Forest_105 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += GBM_grid__1_AutoML_20210523_175248_model_15_Tree_105_class_0.score0(fdata);
  }
}
class GBM_grid__1_AutoML_20210523_175248_model_15_Tree_105_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3]) || data[3 /* domainsCount */] <2.5f ? 
         (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[12])) ? 
             (data[3 /* domainsCount */] <0.5f ? 
                 (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[0])) ? 
                    -0.10343192f : 
                    -0.11444524f) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                     (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[0])) ? 
                        -0.106767796f : 
                         (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[5])) ? 
                            -0.102715984f : 
                            0.103146054f)) : 
                    -0.07569639f)) : 
             (Double.isNaN(data[5 /* isAccountTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[5]) || (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[5])) ? 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                     (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[0])) ? 
                         (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[11])) ? 
                             (data[3 /* domainsCount */] <0.5f ? 
                                -0.01882881f : 
                                -0.01521714f) : 
                            0.021648284f) : 
                         (data[3 /* domainsCount */] <0.5f ? 
                            0.0125736045f : 
                             (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[11])) ? 
                                -0.10219064f : 
                                -0.015901444f))) : 
                     (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[0])) ? 
                        -0.10244134f : 
                        0.017199928f)) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <1.5f ? 
                     (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[11])) ? 
                        -0.009413075f : 
                         (Double.isNaN(data[0 /* htmlBody */]) || !GenModel.bitSetIsInRange(32, 0, data[0]) || (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[0])) ? 
                             (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[8])) ? 
                                0.101269655f : 
                                 (data[3 /* domainsCount */] <0.5f ? 
                                    -0.035679583f : 
                                    0.110354826f)) : 
                             (Double.isNaN(data[3]) || data[3 /* domainsCount */] <0.5f ? 
                                0.026602335f : 
                                -0.020115938f))) : 
                     (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[11])) ? 
                         (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[0])) ? 
                            -0.10860522f : 
                             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[8])) ? 
                                -0.05532633f : 
                                0.10330896f)) : 
                        0.10090464f)))) : 
         (!Double.isNaN(data[5 /* isAccountTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[5]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[5])) ? 
             (Double.isNaN(data[8 /* isPayPalTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[8]) || (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[8])) ? 
                 (Double.isNaN(data[11 /* isVerifyTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[11]) || (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[11])) ? 
                     (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[12])) ? 
                        -0.018480644f : 
                        0.09685108f) : 
                    0.10089648f) : 
                0.07090887f) : 
             (!Double.isNaN(data[0 /* htmlBody */]) && (GenModel.bitSetIsInRange(32, 0, data[0]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[0])) ? 
                 (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT20, 32, 0, data[11])) ? 
                    -0.10198859f : 
                     (Double.isNaN(data[12 /* isAgreeTerm */]) || !GenModel.bitSetIsInRange(32, 0, data[12]) || (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT21, 32, 0, data[12])) ? 
                        -0.101823606f : 
                        -0.10044413f)) : 
                 (Double.isNaN(data[3]) || data[3 /* domainsCount */] <21.5f ? 
                     (!Double.isNaN(data[8 /* isPayPalTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[8]) && !GenModel.bitSetContains(GRPSPLIT22, 32, 0, data[8])) ? 
                        -0.013287415f : 
                         (!Double.isNaN(data[11 /* isVerifyTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[11]) && !GenModel.bitSetContains(GRPSPLIT23, 32, 0, data[11])) ? 
                             (data[3 /* domainsCount */] <7.5f ? 
                                -0.01953823f : 
                                0.027717348f) : 
                             (!Double.isNaN(data[12 /* isAgreeTerm */]) && (GenModel.bitSetIsInRange(32, 0, data[12]) && !GenModel.bitSetContains(GRPSPLIT24, 32, 0, data[12])) ? 
                                -0.10210459f : 
                                 (data[3 /* domainsCount */] <3.5f ? 
                                    0.017178252f : 
                                    0.02281875f)))) : 
                     (Double.isNaN(data[3]) || data[3 /* domainsCount */] <43.5f ? 
                         (Double.isNaN(data[3]) || data[3 /* domainsCount */] <39.5f ? 
                            -0.10055786f : 
                            -0.10064411f) : 
                        0.016711716f)))));
    return pred;
  } // constant pool size = 283B, number of visited nodes = 39, static init size = 750B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT20 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT21 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT22 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT23 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT24 = new byte[] {1, 0, 0, 0};
}


