/*
 * MIT License
 *
 * Copyright (c) 2018, Apptastic Software
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.apptastic.insynsregistret;

import java.util.Objects;

/**
 * Represents a inside trade transaction.
 */
public class Transaction implements Comparable<Transaction> {
    private String publicationDate;
    private String issuer;
    private String leiCode;
    private String notifier;
    private String pdmr;
    private String position;
    private boolean isCloselyAssociated;
    private boolean isAmendment;
    private String detailsOfAmendment;
    private boolean isInitialNotification;
    private boolean isLinkedToShareOptionProgramme;
    private String natureOfTransaction;
    private String instrumentType;
    private String instrumentName;
    private String isin;
    private String transactionDate;
    private double quantity;
    private String unit;
    private double price;
    private String currency;
    private String tradingVenue;
    private String status;


    /**
     * Default constructor.
     */
    public Transaction() {

    }

    /**
     * Copy constructor.
     * @param o - copy
     */
    public Transaction(Transaction o) {
        publicationDate = o.publicationDate;
        issuer = o.issuer;
        leiCode = o.leiCode;
        notifier = o.notifier;
        pdmr = o.pdmr;
        position = o.position;
        isCloselyAssociated = o.isCloselyAssociated;
        isAmendment = o.isAmendment;
        detailsOfAmendment = o.detailsOfAmendment;
        isInitialNotification = o.isInitialNotification;
        isLinkedToShareOptionProgramme = o.isLinkedToShareOptionProgramme;
        natureOfTransaction = o.natureOfTransaction;
        instrumentType = o.instrumentType;
        instrumentName = o.instrumentName;
        isin = o.isin;
        transactionDate = o.transactionDate;
        quantity = o.quantity;
        unit = o.unit;
        price = o.price;
        currency = o.currency;
        tradingVenue = o.tradingVenue;
        status = o.status;
    }


    /**
     * Get the date when the transaction was published by @see <a href="http://google.com">Finansinspektionen</a> (FI).
     * Date string format: yyyy-MM-dd HH:mm:ss
     * @return publication date
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Set the date when the transaction was published by @see <a href="http://google.com">Finansinspektionen</a> (FI).
     * Date string format: yyyy-MM-dd HH:mm:ss
     * @param publicationDate publication
     */
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * Get the issuer name for the transaction, for example Kinnevik AB.
     * @return issuer name
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Set the issuer name for the transaction, for example Kinnevik AB.
     * @param issuer issuer name
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * Get the Legal Entity Identifier (LEI) code for the transaction, for example 2138006PZH76JOS6MN27.
     * @return LEI-code
     */
    public String getLeiCode() {
        return leiCode;
    }

    /**
     * Set the Legal Entity Identifier (LEI) code for the transaction, for example 2138006PZH76JOS6MN27.
     * @param leiCode LEI-code
     */
    public void setLeiCode(String leiCode) {
        this.leiCode = leiCode;
    }

    /**
     * Get the notifier for the transaction.
     * @return notifier
     */
    public String getNotifier() {
        return notifier;
    }

    /**
     * Set the notifier for the transaction.
     * @param notifier notifier
     */
    public void setNotifier(String notifier) {
        this.notifier = notifier;
    }

    /**
     * Get the person discharging managerial responsibilities (PDMR) name for the transaction, for example Stefan Persson.
     * @return PDMR name
     */
    public String getPdmr() {
        return pdmr;
    }

    /**
     * Set the person discharging managerial responsibilities (PDMR) name for the transaction, for example Stefan Persson.
     * @param pdmr PDMR name
     */
    public void setPdmr(String pdmr) {
        this.pdmr = pdmr;
    }

    /**
     * Get the position, for example CFO or VD.
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Set the position, for example CFO or VD.
     * @param position position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Check if there is a closely associated for the transaction.
     * @return is closely associated
     */
    public boolean isCloselyAssociated() {
        return isCloselyAssociated;
    }

    /**
     * Set if there is a closely associated for the transaction.
     * @param closelyAssociated - is closely associated
     */
    public void setCloselyAssociated(boolean closelyAssociated) {
        isCloselyAssociated = closelyAssociated;
    }

    /**
     * Check if amendment for the transaction.
     * @return amendment
     */
    public boolean isAmendment() {
        return isAmendment;
    }

    /**
     * Set if there is a amendment for the transaction.
     * @param amendment amendment
     */
    public void setAmendment(boolean amendment) {
        isAmendment = amendment;
    }

    /**
     * Get details of amendment for the transaction.
     * Example value: "Uppgift om person i ledande ställning"
     * @return details of amendment
     */
    public String getDetailsOfAmendment() {
        return detailsOfAmendment;
    }

    /**
     * Set details of amendment for the transaction.
     * Example value: "Uppgift om person i ledande ställning"
     * @param detailsOfAmendment details of amendment
     */
    public void setDetailsOfAmendment(String detailsOfAmendment) {
        this.detailsOfAmendment = detailsOfAmendment;
    }

    /**
     * Check if initial notification for the transaction.
     * @return initial notification
     */
    public boolean isInitialNotification() {
        return isInitialNotification;
    }

    /**
     * Set initial notification for the transaction.
     * @param initialNotification initial notification
     */
    public void setInitialNotification(boolean initialNotification) {
        isInitialNotification = initialNotification;
    }

    /**
     * Is transaction linked to an share option programme.
     * @return is linked to share option programme
     */
    public boolean isLinkedToShareOptionProgramme() {
        return isLinkedToShareOptionProgramme;
    }

    /**
     * Set if the transaction is linked to an share option programme.
     * @param linkedToShareOptionProgramme linked to share option programme
     */
    public void setLinkedToShareOptionProgramme(boolean linkedToShareOptionProgramme) {
        isLinkedToShareOptionProgramme = linkedToShareOptionProgramme;
    }

    /**
     * Get the nature of the transaction.
     * Example value: Förvärv, Avyttring, Teckning eller Tilldelning.
     * @return nature of transaction
     */
    public String getNatureOfTransaction() {
        return natureOfTransaction;
    }

    /**
     * Set the nature of the transaction.
     * Example value: Förvärv, Avyttring, Teckning eller Tilldelning.
     * @param natureOfTransaction nature of transaction
     */
    public void setNatureOfTransaction(String natureOfTransaction) {
        this.natureOfTransaction = natureOfTransaction;
    }

    /**
     * Get instrument type.
     * @return instrument type
     */
    public String getInstrumentType() {
        return instrumentType;
    }

    /**
     * Set instrument type.
     * @param instrumentType instrument type
     */
    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    /**
     * Get instrument long name.
     * Exmaple value: Kinnevik AB ser. A
     * @return instrument name
     */
    public String getInstrumentName() {
        return instrumentName;
    }

    /**
     * Set instrument long name.
     * Example value: Kinnevik AB ser. A
     * @param instrumentName instrument name
     */
    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    /**
     * Get International Securities Identification Number (ISIN) code.
     * Example value: SE0008373898
     * @return ISIN-code
     */
    public String getIsin() {
        return isin;
    }

    /**
     * Set International Securities Identification Number (ISIN) code.
     * Example value: SE0008373898
     * @param isin ISIN-code
     */
    public void setIsin(String isin) {
        this.isin = isin;
    }

    /**
     * Get the date when the transaction was made.
     * Date string format: yyyy-MM-dd HH:mm:ss
     * @return transaction date
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Set the date when the transaction was made.
     * Date string format: yyyy-MM-dd HH:mm:ss
     * @param transactionDate transaction date
     */
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * Get the quantity.
     * @return quantity
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Set the quantity.
     * @param quantity quantity
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /**
     * Get the quantity unit.
     * Example value: Antal
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Set the quantity unit.
     * Example value: Antal
     * @param unit unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Get the price.
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the price.
     * @param price price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Get the currency.
     * Example value: SEK
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Set the currency
     * Example value: SEK
     * @param currency currency.
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Get the trading venue, (e.g., Nordic Growth Market (NGM) or Nasdaq Stockholm) from where the transaction was made.
     * Example value: NASDAQ STOCKHOLM AB or Utanför handelsplats
     * @return trading venue
     */
    public String getTradingVenue() {
        return tradingVenue;
    }

    /**
     * Get the trading venue, (e.g., Nordic Growth Market (NGM) or Nasdaq Stockholm) from where the transaction was made.
     * Example value: NASDAQ STOCKHOLM AB or Utanför handelsplats
     * @param tradingVenue trading venue
     */
    public void setTradingVenue(String tradingVenue) {
        this.tradingVenue = tradingVenue;
    }

    /**
     * Get status for the transaction.
     * Example values: Aktuell, Reviderad, Makulerad
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set status for the transaction.
     * Example values: Aktuell, Reviderad, Makulerad
     * @param status status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Transaction)) return false;

        Transaction that = (Transaction) o;
        return isCloselyAssociated() == that.isCloselyAssociated() &&
                isAmendment() == that.isAmendment() &&
                isInitialNotification() == that.isInitialNotification() &&
                isLinkedToShareOptionProgramme() == that.isLinkedToShareOptionProgramme() &&
                Double.compare(that.getQuantity(), getQuantity()) == 0 &&
                Double.compare(that.getPrice(), getPrice()) == 0 &&
                Objects.equals(getPublicationDate(), that.getPublicationDate()) &&
                Objects.equals(getIssuer(), that.getIssuer()) &&
                Objects.equals(getLeiCode(), that.getLeiCode()) &&
                Objects.equals(getNotifier(), that.getNotifier()) &&
                Objects.equals(getPdmr(), that.getPdmr()) &&
                Objects.equals(getPosition(), that.getPosition()) &&
                Objects.equals(getDetailsOfAmendment(), that.getDetailsOfAmendment()) &&
                Objects.equals(getNatureOfTransaction(), that.getNatureOfTransaction()) &&
                Objects.equals(getInstrumentType(), that.getInstrumentType()) &&
                Objects.equals(getInstrumentName(), that.getInstrumentName()) &&
                Objects.equals(getIsin(), that.getIsin()) &&
                Objects.equals(getTransactionDate(), that.getTransactionDate()) &&
                Objects.equals(getUnit(), that.getUnit()) &&
                Objects.equals(getCurrency(), that.getCurrency()) &&
                Objects.equals(getTradingVenue(), that.getTradingVenue()) &&
                Objects.equals(getStatus(), that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPublicationDate(), getIssuer(), getLeiCode(), getNotifier(), getPdmr(), getPosition(),
                isCloselyAssociated(), isAmendment(), getDetailsOfAmendment(), isInitialNotification(),
                isLinkedToShareOptionProgramme(), getNatureOfTransaction(), getInstrumentType(), getInstrumentName(),
                getIsin(), getTransactionDate(), getQuantity(), getUnit(), getPrice(), getCurrency(), getTradingVenue(),
                getStatus());
    }

    @Override
    public int compareTo(Transaction o) {
        return transactionDate.compareTo(o.transactionDate);
    }
}
