package com.williamhill.admin.terminalservice.persistence;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Terminal{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID UID;
    @Column(length = 6)
    private int shopId;
    @Column(length = 6)
    private int terminalIndex;
    @Column
    @Convert(converter = StatusConverter.class)
    private Status installStatus;
    @Column
    private Date installationDate;
    @Column(length = 10)
    private String softwareVersion;

    public Terminal() {
    }

    public Terminal(int shopId, int terminalIndex, Status installStatus, Date installationDate, String softwareVersion) {
        this.shopId = shopId;
        this.terminalIndex = terminalIndex;
        this.installStatus = installStatus;
        this.installationDate = installationDate;
        this.softwareVersion = softwareVersion;
    }

    public UUID getUID() {
        return UID;
    }

    public void setUID(UUID UID) {
        this.UID = UID;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getTerminalIndex() {
        return terminalIndex;
    }

    public void setTerminalIndex(int terminalIndex) {
        this.terminalIndex = terminalIndex;
    }

    public Status getInstallStatus() {
        return installStatus;
    }

    public void setInstallStatus(Status installStatus) {
        this.installStatus = installStatus;
    }

    public Date getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(Date installationDate) {
        this.installationDate = installationDate;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}