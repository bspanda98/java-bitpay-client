package com.bitpay.sdk.model.Invoice;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Deprecated //TODO remove in version 5.0
public class PaymentCodes {

    private PaymentCode _btc = new PaymentCode();
    private PaymentCode _bch = new PaymentCode();
    private PaymentCode _eth = new PaymentCode();
    private PaymentCode _usdc = new PaymentCode();
    private PaymentCode _gusd = new PaymentCode();
    private PaymentCode _pax = new PaymentCode();
    private PaymentCode _xrp = new PaymentCode();

    public PaymentCodes() {
    }

    @JsonIgnore
    public PaymentCode getBtc() {
        return _btc;
    }

    @JsonProperty("BTC")
    public void setBtc(PaymentCode btc) {
        this._btc = btc;
    }

    @JsonIgnore
    public PaymentCode getBch() {
        return _bch;
    }

    @JsonProperty("BCH")
    public void setBch(PaymentCode bch) {
        this._bch = bch;
    }

    @JsonIgnore
    public PaymentCode getEth() {
        return _eth;
    }

    @JsonProperty("ETH")
    public void setEth(PaymentCode eth) {
        this._eth = eth;
    }

    @JsonIgnore
    public PaymentCode getUsdc() {
        return _usdc;
    }

    @JsonProperty("USDC")
    public void setUsdc(PaymentCode usdc) {
        this._usdc = usdc;
    }

    @JsonIgnore
    public PaymentCode getGusd() {
        return _gusd;
    }

    @JsonProperty("GUSD")
    public void setGusd(PaymentCode gusd) {
        this._gusd = gusd;
    }

    @JsonIgnore
    public PaymentCode getPax() {
        return _pax;
    }

    @JsonProperty("PAX")
    public void setPax(PaymentCode pax) {
        this._pax = pax;
    }

    @JsonIgnore
    public PaymentCode getXrp() {
        return _xrp;
    }

    @JsonProperty("XRP")
    public void setXrp(PaymentCode xrp) {
        this._xrp = xrp;
    }
}
