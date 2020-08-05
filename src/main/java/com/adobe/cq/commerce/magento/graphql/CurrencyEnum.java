/*******************************************************************************
 *
 *    Copyright 2020 Adobe. All rights reserved.
 *    This file is licensed to you under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License. You may obtain a copy
 *    of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software distributed under
 *    the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 *    OF ANY KIND, either express or implied. See the License for the specific language
 *    governing permissions and limitations under the License.
 *
 ******************************************************************************/

package com.adobe.cq.commerce.magento.graphql;

/**
 * The list of available currency codes
 */
public enum CurrencyEnum {
    AED,

    AFN,

    ALL,

    AMD,

    ANG,

    AOA,

    ARS,

    AUD,

    AWG,

    AZM,

    AZN,

    BAM,

    BBD,

    BDT,

    BGN,

    BHD,

    BIF,

    BMD,

    BND,

    BOB,

    BRL,

    BSD,

    BTN,

    BUK,

    BWP,

    BYN,

    BZD,

    CAD,

    CDF,

    CHE,

    CHF,

    CHW,

    CLP,

    CNY,

    COP,

    CRC,

    CUP,

    CVE,

    CZK,

    DJF,

    DKK,

    DOP,

    DZD,

    EEK,

    EGP,

    ERN,

    ETB,

    EUR,

    FJD,

    FKP,

    GBP,

    GEK,

    GEL,

    GHS,

    GIP,

    GMD,

    GNF,

    GQE,

    GTQ,

    GYD,

    HKD,

    HNL,

    HRK,

    HTG,

    HUF,

    IDR,

    ILS,

    INR,

    IQD,

    IRR,

    ISK,

    JMD,

    JOD,

    JPY,

    KES,

    KGS,

    KHR,

    KMF,

    KPW,

    KRW,

    KWD,

    KYD,

    KZT,

    LAK,

    LBP,

    LKR,

    LRD,

    LSL,

    LSM,

    LTL,

    LVL,

    LYD,

    MAD,

    MDL,

    MGA,

    MKD,

    MMK,

    MNT,

    MOP,

    MRO,

    MUR,

    MVR,

    MWK,

    MXN,

    MYR,

    MZN,

    NAD,

    NGN,

    NIC,

    NOK,

    NPR,

    NZD,

    OMR,

    PAB,

    PEN,

    PGK,

    PHP,

    PKR,

    PLN,

    PYG,

    QAR,

    RHD,

    ROL,

    RON,

    RSD,

    RUB,

    RWF,

    SAR,

    SBD,

    SCR,

    SDG,

    SEK,

    SGD,

    SHP,

    SKK,

    SLL,

    SOS,

    SRD,

    STD,

    SVC,

    SYP,

    SZL,

    THB,

    TJS,

    TMM,

    TND,

    TOP,

    TRL,

    TRY,

    TTD,

    TWD,

    TZS,

    UAH,

    UGX,

    USD,

    UYU,

    UZS,

    VEB,

    VEF,

    VND,

    VUV,

    WST,

    XCD,

    XOF,

    XPF,

    YER,

    YTL,

    ZAR,

    ZMK,

    ZWD,

    UNKNOWN_VALUE;

    public static CurrencyEnum fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AED": {
                return AED;
            }

            case "AFN": {
                return AFN;
            }

            case "ALL": {
                return ALL;
            }

            case "AMD": {
                return AMD;
            }

            case "ANG": {
                return ANG;
            }

            case "AOA": {
                return AOA;
            }

            case "ARS": {
                return ARS;
            }

            case "AUD": {
                return AUD;
            }

            case "AWG": {
                return AWG;
            }

            case "AZM": {
                return AZM;
            }

            case "AZN": {
                return AZN;
            }

            case "BAM": {
                return BAM;
            }

            case "BBD": {
                return BBD;
            }

            case "BDT": {
                return BDT;
            }

            case "BGN": {
                return BGN;
            }

            case "BHD": {
                return BHD;
            }

            case "BIF": {
                return BIF;
            }

            case "BMD": {
                return BMD;
            }

            case "BND": {
                return BND;
            }

            case "BOB": {
                return BOB;
            }

            case "BRL": {
                return BRL;
            }

            case "BSD": {
                return BSD;
            }

            case "BTN": {
                return BTN;
            }

            case "BUK": {
                return BUK;
            }

            case "BWP": {
                return BWP;
            }

            case "BYN": {
                return BYN;
            }

            case "BZD": {
                return BZD;
            }

            case "CAD": {
                return CAD;
            }

            case "CDF": {
                return CDF;
            }

            case "CHE": {
                return CHE;
            }

            case "CHF": {
                return CHF;
            }

            case "CHW": {
                return CHW;
            }

            case "CLP": {
                return CLP;
            }

            case "CNY": {
                return CNY;
            }

            case "COP": {
                return COP;
            }

            case "CRC": {
                return CRC;
            }

            case "CUP": {
                return CUP;
            }

            case "CVE": {
                return CVE;
            }

            case "CZK": {
                return CZK;
            }

            case "DJF": {
                return DJF;
            }

            case "DKK": {
                return DKK;
            }

            case "DOP": {
                return DOP;
            }

            case "DZD": {
                return DZD;
            }

            case "EEK": {
                return EEK;
            }

            case "EGP": {
                return EGP;
            }

            case "ERN": {
                return ERN;
            }

            case "ETB": {
                return ETB;
            }

            case "EUR": {
                return EUR;
            }

            case "FJD": {
                return FJD;
            }

            case "FKP": {
                return FKP;
            }

            case "GBP": {
                return GBP;
            }

            case "GEK": {
                return GEK;
            }

            case "GEL": {
                return GEL;
            }

            case "GHS": {
                return GHS;
            }

            case "GIP": {
                return GIP;
            }

            case "GMD": {
                return GMD;
            }

            case "GNF": {
                return GNF;
            }

            case "GQE": {
                return GQE;
            }

            case "GTQ": {
                return GTQ;
            }

            case "GYD": {
                return GYD;
            }

            case "HKD": {
                return HKD;
            }

            case "HNL": {
                return HNL;
            }

            case "HRK": {
                return HRK;
            }

            case "HTG": {
                return HTG;
            }

            case "HUF": {
                return HUF;
            }

            case "IDR": {
                return IDR;
            }

            case "ILS": {
                return ILS;
            }

            case "INR": {
                return INR;
            }

            case "IQD": {
                return IQD;
            }

            case "IRR": {
                return IRR;
            }

            case "ISK": {
                return ISK;
            }

            case "JMD": {
                return JMD;
            }

            case "JOD": {
                return JOD;
            }

            case "JPY": {
                return JPY;
            }

            case "KES": {
                return KES;
            }

            case "KGS": {
                return KGS;
            }

            case "KHR": {
                return KHR;
            }

            case "KMF": {
                return KMF;
            }

            case "KPW": {
                return KPW;
            }

            case "KRW": {
                return KRW;
            }

            case "KWD": {
                return KWD;
            }

            case "KYD": {
                return KYD;
            }

            case "KZT": {
                return KZT;
            }

            case "LAK": {
                return LAK;
            }

            case "LBP": {
                return LBP;
            }

            case "LKR": {
                return LKR;
            }

            case "LRD": {
                return LRD;
            }

            case "LSL": {
                return LSL;
            }

            case "LSM": {
                return LSM;
            }

            case "LTL": {
                return LTL;
            }

            case "LVL": {
                return LVL;
            }

            case "LYD": {
                return LYD;
            }

            case "MAD": {
                return MAD;
            }

            case "MDL": {
                return MDL;
            }

            case "MGA": {
                return MGA;
            }

            case "MKD": {
                return MKD;
            }

            case "MMK": {
                return MMK;
            }

            case "MNT": {
                return MNT;
            }

            case "MOP": {
                return MOP;
            }

            case "MRO": {
                return MRO;
            }

            case "MUR": {
                return MUR;
            }

            case "MVR": {
                return MVR;
            }

            case "MWK": {
                return MWK;
            }

            case "MXN": {
                return MXN;
            }

            case "MYR": {
                return MYR;
            }

            case "MZN": {
                return MZN;
            }

            case "NAD": {
                return NAD;
            }

            case "NGN": {
                return NGN;
            }

            case "NIC": {
                return NIC;
            }

            case "NOK": {
                return NOK;
            }

            case "NPR": {
                return NPR;
            }

            case "NZD": {
                return NZD;
            }

            case "OMR": {
                return OMR;
            }

            case "PAB": {
                return PAB;
            }

            case "PEN": {
                return PEN;
            }

            case "PGK": {
                return PGK;
            }

            case "PHP": {
                return PHP;
            }

            case "PKR": {
                return PKR;
            }

            case "PLN": {
                return PLN;
            }

            case "PYG": {
                return PYG;
            }

            case "QAR": {
                return QAR;
            }

            case "RHD": {
                return RHD;
            }

            case "ROL": {
                return ROL;
            }

            case "RON": {
                return RON;
            }

            case "RSD": {
                return RSD;
            }

            case "RUB": {
                return RUB;
            }

            case "RWF": {
                return RWF;
            }

            case "SAR": {
                return SAR;
            }

            case "SBD": {
                return SBD;
            }

            case "SCR": {
                return SCR;
            }

            case "SDG": {
                return SDG;
            }

            case "SEK": {
                return SEK;
            }

            case "SGD": {
                return SGD;
            }

            case "SHP": {
                return SHP;
            }

            case "SKK": {
                return SKK;
            }

            case "SLL": {
                return SLL;
            }

            case "SOS": {
                return SOS;
            }

            case "SRD": {
                return SRD;
            }

            case "STD": {
                return STD;
            }

            case "SVC": {
                return SVC;
            }

            case "SYP": {
                return SYP;
            }

            case "SZL": {
                return SZL;
            }

            case "THB": {
                return THB;
            }

            case "TJS": {
                return TJS;
            }

            case "TMM": {
                return TMM;
            }

            case "TND": {
                return TND;
            }

            case "TOP": {
                return TOP;
            }

            case "TRL": {
                return TRL;
            }

            case "TRY": {
                return TRY;
            }

            case "TTD": {
                return TTD;
            }

            case "TWD": {
                return TWD;
            }

            case "TZS": {
                return TZS;
            }

            case "UAH": {
                return UAH;
            }

            case "UGX": {
                return UGX;
            }

            case "USD": {
                return USD;
            }

            case "UYU": {
                return UYU;
            }

            case "UZS": {
                return UZS;
            }

            case "VEB": {
                return VEB;
            }

            case "VEF": {
                return VEF;
            }

            case "VND": {
                return VND;
            }

            case "VUV": {
                return VUV;
            }

            case "WST": {
                return WST;
            }

            case "XCD": {
                return XCD;
            }

            case "XOF": {
                return XOF;
            }

            case "XPF": {
                return XPF;
            }

            case "YER": {
                return YER;
            }

            case "YTL": {
                return YTL;
            }

            case "ZAR": {
                return ZAR;
            }

            case "ZMK": {
                return ZMK;
            }

            case "ZWD": {
                return ZWD;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AED: {
                return "AED";
            }

            case AFN: {
                return "AFN";
            }

            case ALL: {
                return "ALL";
            }

            case AMD: {
                return "AMD";
            }

            case ANG: {
                return "ANG";
            }

            case AOA: {
                return "AOA";
            }

            case ARS: {
                return "ARS";
            }

            case AUD: {
                return "AUD";
            }

            case AWG: {
                return "AWG";
            }

            case AZM: {
                return "AZM";
            }

            case AZN: {
                return "AZN";
            }

            case BAM: {
                return "BAM";
            }

            case BBD: {
                return "BBD";
            }

            case BDT: {
                return "BDT";
            }

            case BGN: {
                return "BGN";
            }

            case BHD: {
                return "BHD";
            }

            case BIF: {
                return "BIF";
            }

            case BMD: {
                return "BMD";
            }

            case BND: {
                return "BND";
            }

            case BOB: {
                return "BOB";
            }

            case BRL: {
                return "BRL";
            }

            case BSD: {
                return "BSD";
            }

            case BTN: {
                return "BTN";
            }

            case BUK: {
                return "BUK";
            }

            case BWP: {
                return "BWP";
            }

            case BYN: {
                return "BYN";
            }

            case BZD: {
                return "BZD";
            }

            case CAD: {
                return "CAD";
            }

            case CDF: {
                return "CDF";
            }

            case CHE: {
                return "CHE";
            }

            case CHF: {
                return "CHF";
            }

            case CHW: {
                return "CHW";
            }

            case CLP: {
                return "CLP";
            }

            case CNY: {
                return "CNY";
            }

            case COP: {
                return "COP";
            }

            case CRC: {
                return "CRC";
            }

            case CUP: {
                return "CUP";
            }

            case CVE: {
                return "CVE";
            }

            case CZK: {
                return "CZK";
            }

            case DJF: {
                return "DJF";
            }

            case DKK: {
                return "DKK";
            }

            case DOP: {
                return "DOP";
            }

            case DZD: {
                return "DZD";
            }

            case EEK: {
                return "EEK";
            }

            case EGP: {
                return "EGP";
            }

            case ERN: {
                return "ERN";
            }

            case ETB: {
                return "ETB";
            }

            case EUR: {
                return "EUR";
            }

            case FJD: {
                return "FJD";
            }

            case FKP: {
                return "FKP";
            }

            case GBP: {
                return "GBP";
            }

            case GEK: {
                return "GEK";
            }

            case GEL: {
                return "GEL";
            }

            case GHS: {
                return "GHS";
            }

            case GIP: {
                return "GIP";
            }

            case GMD: {
                return "GMD";
            }

            case GNF: {
                return "GNF";
            }

            case GQE: {
                return "GQE";
            }

            case GTQ: {
                return "GTQ";
            }

            case GYD: {
                return "GYD";
            }

            case HKD: {
                return "HKD";
            }

            case HNL: {
                return "HNL";
            }

            case HRK: {
                return "HRK";
            }

            case HTG: {
                return "HTG";
            }

            case HUF: {
                return "HUF";
            }

            case IDR: {
                return "IDR";
            }

            case ILS: {
                return "ILS";
            }

            case INR: {
                return "INR";
            }

            case IQD: {
                return "IQD";
            }

            case IRR: {
                return "IRR";
            }

            case ISK: {
                return "ISK";
            }

            case JMD: {
                return "JMD";
            }

            case JOD: {
                return "JOD";
            }

            case JPY: {
                return "JPY";
            }

            case KES: {
                return "KES";
            }

            case KGS: {
                return "KGS";
            }

            case KHR: {
                return "KHR";
            }

            case KMF: {
                return "KMF";
            }

            case KPW: {
                return "KPW";
            }

            case KRW: {
                return "KRW";
            }

            case KWD: {
                return "KWD";
            }

            case KYD: {
                return "KYD";
            }

            case KZT: {
                return "KZT";
            }

            case LAK: {
                return "LAK";
            }

            case LBP: {
                return "LBP";
            }

            case LKR: {
                return "LKR";
            }

            case LRD: {
                return "LRD";
            }

            case LSL: {
                return "LSL";
            }

            case LSM: {
                return "LSM";
            }

            case LTL: {
                return "LTL";
            }

            case LVL: {
                return "LVL";
            }

            case LYD: {
                return "LYD";
            }

            case MAD: {
                return "MAD";
            }

            case MDL: {
                return "MDL";
            }

            case MGA: {
                return "MGA";
            }

            case MKD: {
                return "MKD";
            }

            case MMK: {
                return "MMK";
            }

            case MNT: {
                return "MNT";
            }

            case MOP: {
                return "MOP";
            }

            case MRO: {
                return "MRO";
            }

            case MUR: {
                return "MUR";
            }

            case MVR: {
                return "MVR";
            }

            case MWK: {
                return "MWK";
            }

            case MXN: {
                return "MXN";
            }

            case MYR: {
                return "MYR";
            }

            case MZN: {
                return "MZN";
            }

            case NAD: {
                return "NAD";
            }

            case NGN: {
                return "NGN";
            }

            case NIC: {
                return "NIC";
            }

            case NOK: {
                return "NOK";
            }

            case NPR: {
                return "NPR";
            }

            case NZD: {
                return "NZD";
            }

            case OMR: {
                return "OMR";
            }

            case PAB: {
                return "PAB";
            }

            case PEN: {
                return "PEN";
            }

            case PGK: {
                return "PGK";
            }

            case PHP: {
                return "PHP";
            }

            case PKR: {
                return "PKR";
            }

            case PLN: {
                return "PLN";
            }

            case PYG: {
                return "PYG";
            }

            case QAR: {
                return "QAR";
            }

            case RHD: {
                return "RHD";
            }

            case ROL: {
                return "ROL";
            }

            case RON: {
                return "RON";
            }

            case RSD: {
                return "RSD";
            }

            case RUB: {
                return "RUB";
            }

            case RWF: {
                return "RWF";
            }

            case SAR: {
                return "SAR";
            }

            case SBD: {
                return "SBD";
            }

            case SCR: {
                return "SCR";
            }

            case SDG: {
                return "SDG";
            }

            case SEK: {
                return "SEK";
            }

            case SGD: {
                return "SGD";
            }

            case SHP: {
                return "SHP";
            }

            case SKK: {
                return "SKK";
            }

            case SLL: {
                return "SLL";
            }

            case SOS: {
                return "SOS";
            }

            case SRD: {
                return "SRD";
            }

            case STD: {
                return "STD";
            }

            case SVC: {
                return "SVC";
            }

            case SYP: {
                return "SYP";
            }

            case SZL: {
                return "SZL";
            }

            case THB: {
                return "THB";
            }

            case TJS: {
                return "TJS";
            }

            case TMM: {
                return "TMM";
            }

            case TND: {
                return "TND";
            }

            case TOP: {
                return "TOP";
            }

            case TRL: {
                return "TRL";
            }

            case TRY: {
                return "TRY";
            }

            case TTD: {
                return "TTD";
            }

            case TWD: {
                return "TWD";
            }

            case TZS: {
                return "TZS";
            }

            case UAH: {
                return "UAH";
            }

            case UGX: {
                return "UGX";
            }

            case USD: {
                return "USD";
            }

            case UYU: {
                return "UYU";
            }

            case UZS: {
                return "UZS";
            }

            case VEB: {
                return "VEB";
            }

            case VEF: {
                return "VEF";
            }

            case VND: {
                return "VND";
            }

            case VUV: {
                return "VUV";
            }

            case WST: {
                return "WST";
            }

            case XCD: {
                return "XCD";
            }

            case XOF: {
                return "XOF";
            }

            case XPF: {
                return "XPF";
            }

            case YER: {
                return "YER";
            }

            case YTL: {
                return "YTL";
            }

            case ZAR: {
                return "ZAR";
            }

            case ZMK: {
                return "ZMK";
            }

            case ZWD: {
                return "ZWD";
            }

            default: {
                return "";
            }
        }
    }
}

