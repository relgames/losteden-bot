package com.losteden.output;

import com.jacob.com.*;

public class IAutoItX3 extends Dispatch {

    public static final String componentName = "AutoItX3Lib.IAutoItX3";

    public IAutoItX3() {
        super(componentName);
    }

    /**
     * This constructor is used instead of a case operation to
     * turn a Dispatch object into a wider object - it must exist
     * in every wrapper class whose instances may be returned from
     * method calls wrapped in VT_DISPATCH Variants.
     */
    public IAutoItX3(Dispatch d) {
        // take over the IDispatch pointer
        m_pDispatch = d.m_pDispatch;
        // null out the input's pointer
        d.m_pDispatch = 0;
    }

    public IAutoItX3(String compName) {
        super(compName);
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int geterror() {
        return Dispatch.get(this, "error").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int getSW_HIDE() {
        return Dispatch.get(this, "SW_HIDE").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int getSW_MAXIMIZE() {
        return Dispatch.get(this, "SW_MAXIMIZE").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int getSW_MINIMIZE() {
        return Dispatch.get(this, "SW_MINIMIZE").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int getSW_RESTORE() {
        return Dispatch.get(this, "SW_RESTORE").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int getSW_SHOW() {
        return Dispatch.get(this, "SW_SHOW").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int getSW_SHOWDEFAULT() {
        return Dispatch.get(this, "SW_SHOWDEFAULT").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int getSW_SHOWMAXIMIZED() {
        return Dispatch.get(this, "SW_SHOWMAXIMIZED").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int getSW_SHOWMINIMIZED() {
        return Dispatch.get(this, "SW_SHOWMINIMIZED").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int getSW_SHOWMINNOACTIVE() {
        return Dispatch.get(this, "SW_SHOWMINNOACTIVE").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int getSW_SHOWNA() {
        return Dispatch.get(this, "SW_SHOWNA").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int getSW_SHOWNOACTIVATE() {
        return Dispatch.get(this, "SW_SHOWNOACTIVATE").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int getSW_SHOWNORMAL() {
        return Dispatch.get(this, "SW_SHOWNORMAL").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     */
    public void init() {
        Dispatch.call(this, "Init");
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strOption an input-parameter of type String
     * @param nValue    an input-parameter of type int
     * @return the result is of type int
     */
    public int autoItSetOption(String strOption, int nValue) {
        return Dispatch.call(this, "AutoItSetOption", strOption, new Variant(nValue)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param nFlag an input-parameter of type int
     */
    public void blockInput(int nFlag) {
        Dispatch.call(this, "BlockInput", new Variant(nFlag));
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strDrive  an input-parameter of type String
     * @param strAction an input-parameter of type String
     */
    public void cDTray(String strDrive, String strAction) {
        Dispatch.call(this, "CDTray", strDrive, strAction);
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type String
     */
    public String clipGet() {
        return Dispatch.call(this, "ClipGet").toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strClip an input-parameter of type String
     */
    public void clipPut(String strClip) {
        Dispatch.call(this, "ClipPut", strClip);
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @param strButton  an input-parameter of type String
     * @param nNumClicks an input-parameter of type int
     * @param nX         an input-parameter of type int
     * @return the result is of type int
     */
    public int controlClick(String strTitle, String strText, String strControl, String strButton, int nNumClicks, int nX) {
        return Dispatch.call(this, "ControlClick", strTitle, strText, strControl, strButton, new Variant(nNumClicks), new Variant(nX)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @param strButton  an input-parameter of type String
     * @param nNumClicks an input-parameter of type int
     * @return the result is of type int
     */
    public int controlClick(String strTitle, String strText, String strControl, String strButton, int nNumClicks) {
        return Dispatch.call(this, "ControlClick", strTitle, strText, strControl, strButton, new Variant(nNumClicks)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @param strButton  an input-parameter of type String
     * @return the result is of type int
     */
    public int controlClick(String strTitle, String strText, String strControl, String strButton) {
        return Dispatch.call(this, "ControlClick", strTitle, strText, strControl, strButton).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @return the result is of type int
     */
    public int controlClick(String strTitle, String strText, String strControl) {
        return Dispatch.call(this, "ControlClick", strTitle, strText, strControl).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @param strCommand an input-parameter of type String
     * @param strExtra   an input-parameter of type String
     * @return the result is of type String
     */
    public String controlCommand(String strTitle, String strText, String strControl, String strCommand, String strExtra) {
        return Dispatch.call(this, "ControlCommand", strTitle, strText, strControl, strCommand, strExtra).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @return the result is of type int
     */
    public int controlDisable(String strTitle, String strText, String strControl) {
        return Dispatch.call(this, "ControlDisable", strTitle, strText, strControl).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @return the result is of type int
     */
    public int controlEnable(String strTitle, String strText, String strControl) {
        return Dispatch.call(this, "ControlEnable", strTitle, strText, strControl).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @return the result is of type int
     */
    public int controlFocus(String strTitle, String strText, String strControl) {
        return Dispatch.call(this, "ControlFocus", strTitle, strText, strControl).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type String
     */
    public String controlGetFocus(String strTitle) {
        return Dispatch.call(this, "ControlGetFocus", strTitle).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type String
     */
    public String controlGetFocus(String strTitle, String strText) {
        return Dispatch.call(this, "ControlGetFocus", strTitle, strText).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @return the result is of type String
     */
    public String controlGetHandle(String strTitle, String strText, String strControl) {
        return Dispatch.call(this, "ControlGetHandle", strTitle, strText, strControl).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @return the result is of type int
     */
    public int controlGetPosX(String strTitle, String strText, String strControl) {
        return Dispatch.call(this, "ControlGetPosX", strTitle, strText, strControl).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @return the result is of type int
     */
    public int controlGetPosY(String strTitle, String strText, String strControl) {
        return Dispatch.call(this, "ControlGetPosY", strTitle, strText, strControl).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @return the result is of type int
     */
    public int controlGetPosHeight(String strTitle, String strText, String strControl) {
        return Dispatch.call(this, "ControlGetPosHeight", strTitle, strText, strControl).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @return the result is of type int
     */
    public int controlGetPosWidth(String strTitle, String strText, String strControl) {
        return Dispatch.call(this, "ControlGetPosWidth", strTitle, strText, strControl).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @return the result is of type String
     */
    public String controlGetText(String strTitle, String strText, String strControl) {
        return Dispatch.call(this, "ControlGetText", strTitle, strText, strControl).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @return the result is of type int
     */
    public int controlHide(String strTitle, String strText, String strControl) {
        return Dispatch.call(this, "ControlHide", strTitle, strText, strControl).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @param strCommand an input-parameter of type String
     * @param strExtra1  an input-parameter of type String
     * @param strExtra2  an input-parameter of type String
     * @return the result is of type String
     */
    public String controlListView(String strTitle, String strText, String strControl, String strCommand, String strExtra1, String strExtra2) {
        return Dispatch.call(this, "ControlListView", strTitle, strText, strControl, strCommand, strExtra1, strExtra2).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @param nX         an input-parameter of type int
     * @param nY         an input-parameter of type int
     * @param nWidth     an input-parameter of type int
     * @return the result is of type int
     */
    public int controlMove(String strTitle, String strText, String strControl, int nX, int nY, int nWidth) {
        return Dispatch.call(this, "ControlMove", strTitle, strText, strControl, new Variant(nX), new Variant(nY), new Variant(nWidth)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @param nX         an input-parameter of type int
     * @param nY         an input-parameter of type int
     * @return the result is of type int
     */
    public int controlMove(String strTitle, String strText, String strControl, int nX, int nY) {
        return Dispatch.call(this, "ControlMove", strTitle, strText, strControl, new Variant(nX), new Variant(nY)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @param nX         an input-parameter of type int
     * @param nY         an input-parameter of type int
     * @param nWidth     an input-parameter of type int
     * @param nHeight    an input-parameter of type int
     * @return the result is of type int
     */
    public int controlMove(String strTitle, String strText, String strControl, int nX, int nY, int nWidth, int nHeight) {
        return Dispatch.call(this, "ControlMove", strTitle, strText, strControl, new Variant(nX), new Variant(nY), new Variant(nWidth), new Variant(nHeight)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle    an input-parameter of type String
     * @param strText     an input-parameter of type String
     * @param strControl  an input-parameter of type String
     * @param strSendText an input-parameter of type String
     * @return the result is of type int
     */
    public int controlSend(String strTitle, String strText, String strControl, String strSendText) {
        return Dispatch.call(this, "ControlSend", strTitle, strText, strControl, strSendText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle    an input-parameter of type String
     * @param strText     an input-parameter of type String
     * @param strControl  an input-parameter of type String
     * @param strSendText an input-parameter of type String
     * @param nMode       an input-parameter of type int
     * @return the result is of type int
     */
    public int controlSend(String strTitle, String strText, String strControl, String strSendText, int nMode) {
        return Dispatch.call(this, "ControlSend", strTitle, strText, strControl, strSendText, new Variant(nMode)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle       an input-parameter of type String
     * @param strText        an input-parameter of type String
     * @param strControl     an input-parameter of type String
     * @param strControlText an input-parameter of type String
     * @return the result is of type int
     */
    public int controlSetText(String strTitle, String strText, String strControl, String strControlText) {
        return Dispatch.call(this, "ControlSetText", strTitle, strText, strControl, strControlText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle   an input-parameter of type String
     * @param strText    an input-parameter of type String
     * @param strControl an input-parameter of type String
     * @return the result is of type int
     */
    public int controlShow(String strTitle, String strText, String strControl) {
        return Dispatch.call(this, "ControlShow", strTitle, strText, strControl).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strDevice an input-parameter of type String
     * @param strShare  an input-parameter of type String
     * @param nFlags    an input-parameter of type int
     * @param strUser   an input-parameter of type String
     * @return the result is of type String
     */
    public String driveMapAdd(String strDevice, String strShare, int nFlags, String strUser) {
        return Dispatch.call(this, "DriveMapAdd", strDevice, strShare, new Variant(nFlags), strUser).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strDevice an input-parameter of type String
     * @param strShare  an input-parameter of type String
     * @param nFlags    an input-parameter of type int
     * @return the result is of type String
     */
    public String driveMapAdd(String strDevice, String strShare, int nFlags) {
        return Dispatch.call(this, "DriveMapAdd", strDevice, strShare, new Variant(nFlags)).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strDevice an input-parameter of type String
     * @param strShare  an input-parameter of type String
     * @return the result is of type String
     */
    public String driveMapAdd(String strDevice, String strShare) {
        return Dispatch.call(this, "DriveMapAdd", strDevice, strShare).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strDevice an input-parameter of type String
     * @return the result is of type int
     */
    public int driveMapDel(String strDevice) {
        return Dispatch.call(this, "DriveMapDel", strDevice).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strDevice an input-parameter of type String
     * @return the result is of type String
     */
    public String driveMapGet(String strDevice) {
        return Dispatch.call(this, "DriveMapGet", strDevice).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strFilename an input-parameter of type String
     * @param strSection  an input-parameter of type String
     * @return the result is of type int
     */
    public int iniDelete(String strFilename, String strSection) {
        return Dispatch.call(this, "IniDelete", strFilename, strSection).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strFilename an input-parameter of type String
     * @param strSection  an input-parameter of type String
     * @param strKey      an input-parameter of type String
     * @return the result is of type int
     */
    public int iniDelete(String strFilename, String strSection, String strKey) {
        return Dispatch.call(this, "IniDelete", strFilename, strSection, strKey).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strFilename an input-parameter of type String
     * @param strSection  an input-parameter of type String
     * @param strKey      an input-parameter of type String
     * @param strDefault  an input-parameter of type String
     * @return the result is of type String
     */
    public String iniRead(String strFilename, String strSection, String strKey, String strDefault) {
        return Dispatch.call(this, "IniRead", strFilename, strSection, strKey, strDefault).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strFilename an input-parameter of type String
     * @param strSection  an input-parameter of type String
     * @param strKey      an input-parameter of type String
     * @param strValue    an input-parameter of type String
     * @return the result is of type int
     */
    public int iniWrite(String strFilename, String strSection, String strKey, String strValue) {
        return Dispatch.call(this, "IniWrite", strFilename, strSection, strKey, strValue).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int isAdmin() {
        return Dispatch.call(this, "IsAdmin").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strButton an input-parameter of type String
     * @param nX        an input-parameter of type int
     * @param nY        an input-parameter of type int
     * @param nClicks   an input-parameter of type int
     * @return the result is of type int
     */
    public int mouseClick(String strButton, int nX, int nY, int nClicks) {
        return Dispatch.call(this, "MouseClick", strButton, new Variant(nX), new Variant(nY), new Variant(nClicks)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strButton an input-parameter of type String
     * @param nX        an input-parameter of type int
     * @param nY        an input-parameter of type int
     * @return the result is of type int
     */
    public int mouseClick(String strButton, int nX, int nY) {
        return Dispatch.call(this, "MouseClick", strButton, new Variant(nX), new Variant(nY)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strButton an input-parameter of type String
     * @param nX        an input-parameter of type int
     * @return the result is of type int
     */
    public int mouseClick(String strButton, int nX) {
        return Dispatch.call(this, "MouseClick", strButton, new Variant(nX)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strButton an input-parameter of type String
     * @return the result is of type int
     */
    public int mouseClick(String strButton) {
        return Dispatch.call(this, "MouseClick", strButton).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int mouseClick() {
        return Dispatch.call(this, "MouseClick").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strButton an input-parameter of type String
     * @param nX        an input-parameter of type int
     * @param nY        an input-parameter of type int
     * @param nClicks   an input-parameter of type int
     * @param nSpeed    an input-parameter of type int
     * @return the result is of type int
     */
    public int mouseClick(String strButton, int nX, int nY, int nClicks, int nSpeed) {
        return Dispatch.call(this, "MouseClick", strButton, new Variant(nX), new Variant(nY), new Variant(nClicks), new Variant(nSpeed)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strButton an input-parameter of type String
     * @param nX1       an input-parameter of type int
     * @param nY1       an input-parameter of type int
     * @param nX2       an input-parameter of type int
     * @param nY2       an input-parameter of type int
     * @return the result is of type int
     */
    public int mouseClickDrag(String strButton, int nX1, int nY1, int nX2, int nY2) {
        return Dispatch.call(this, "MouseClickDrag", strButton, new Variant(nX1), new Variant(nY1), new Variant(nX2), new Variant(nY2)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strButton an input-parameter of type String
     * @param nX1       an input-parameter of type int
     * @param nY1       an input-parameter of type int
     * @param nX2       an input-parameter of type int
     * @param nY2       an input-parameter of type int
     * @param nSpeed    an input-parameter of type int
     * @return the result is of type int
     */
    public int mouseClickDrag(String strButton, int nX1, int nY1, int nX2, int nY2, int nSpeed) {
        return Dispatch.call(this, "MouseClickDrag", strButton, new Variant(nX1), new Variant(nY1), new Variant(nX2), new Variant(nY2), new Variant(nSpeed)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     */
    public void mouseDown() {
        Dispatch.call(this, "MouseDown");
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strButton an input-parameter of type String
     */
    public void mouseDown(String strButton) {
        Dispatch.call(this, "MouseDown", strButton);

    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int mouseGetCursor() {
        return Dispatch.call(this, "MouseGetCursor").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int mouseGetPosX() {
        return Dispatch.call(this, "MouseGetPosX").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int mouseGetPosY() {
        return Dispatch.call(this, "MouseGetPosY").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param nX an input-parameter of type int
     * @param nY an input-parameter of type int
     * @return the result is of type int
     */
    public int mouseMove(int nX, int nY) {
        return Dispatch.call(this, "MouseMove", new Variant(nX), new Variant(nY)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     */
    public void mouseUp() {
        Dispatch.call(this, "MouseUp");
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strButton an input-parameter of type String
     */
    public void mouseUp(String strButton) {
        Dispatch.call(this, "MouseUp", strButton);

    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strDirection an input-parameter of type String
     */
    public void mouseWheel(String strDirection) {
        Dispatch.call(this, "MouseWheel", strDirection);
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strDirection an input-parameter of type String
     * @param nClicks      an input-parameter of type int
     */
    public void mouseWheel(String strDirection, int nClicks) {
        Dispatch.call(this, "MouseWheel", strDirection, new Variant(nClicks));

    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strOption an input-parameter of type String
     * @param nValue    an input-parameter of type int
     * @return the result is of type int
     */
    public int opt(String strOption, int nValue) {
        return Dispatch.call(this, "Opt", strOption, new Variant(nValue)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param nLeft   an input-parameter of type int
     * @param nTop    an input-parameter of type int
     * @param nRight  an input-parameter of type int
     * @param nBottom an input-parameter of type int
     * @return the result is of type int
     */
    public int pixelChecksum(int nLeft, int nTop, int nRight, int nBottom) {
        return Dispatch.call(this, "PixelChecksum", new Variant(nLeft), new Variant(nTop), new Variant(nRight), new Variant(nBottom)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param nLeft   an input-parameter of type int
     * @param nTop    an input-parameter of type int
     * @param nRight  an input-parameter of type int
     * @param nBottom an input-parameter of type int
     * @param nStep   an input-parameter of type int
     * @return the result is of type int
     */
    public int pixelChecksum(int nLeft, int nTop, int nRight, int nBottom, int nStep) {
        return Dispatch.call(this, "PixelChecksum", new Variant(nLeft), new Variant(nTop), new Variant(nRight), new Variant(nBottom), new Variant(nStep)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param nX an input-parameter of type int
     * @param nY an input-parameter of type int
     * @return the result is of type int
     */
    public int pixelGetColor(int nX, int nY) {
        return Dispatch.call(this, "PixelGetColor", new Variant(nX), new Variant(nY)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param nLeft   an input-parameter of type int
     * @param nTop    an input-parameter of type int
     * @param nRight  an input-parameter of type int
     * @param nBottom an input-parameter of type int
     * @param nCol    an input-parameter of type int
     * @param nVar    an input-parameter of type int
     * @return the result is of type Variant
     */
    public Variant pixelSearch(int nLeft, int nTop, int nRight, int nBottom, int nCol, int nVar) {
        return Dispatch.call(this, "PixelSearch", new Variant(nLeft), new Variant(nTop), new Variant(nRight), new Variant(nBottom), new Variant(nCol), new Variant(nVar));
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param nLeft   an input-parameter of type int
     * @param nTop    an input-parameter of type int
     * @param nRight  an input-parameter of type int
     * @param nBottom an input-parameter of type int
     * @param nCol    an input-parameter of type int
     * @return the result is of type Variant
     */
    public Variant pixelSearch(int nLeft, int nTop, int nRight, int nBottom, int nCol) {
        return Dispatch.call(this, "PixelSearch", new Variant(nLeft), new Variant(nTop), new Variant(nRight), new Variant(nBottom), new Variant(nCol));
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param nLeft   an input-parameter of type int
     * @param nTop    an input-parameter of type int
     * @param nRight  an input-parameter of type int
     * @param nBottom an input-parameter of type int
     * @param nCol    an input-parameter of type int
     * @param nVar    an input-parameter of type int
     * @param nStep   an input-parameter of type int
     * @return the result is of type Variant
     */
    public Variant pixelSearch(int nLeft, int nTop, int nRight, int nBottom, int nCol, int nVar, int nStep) {
        return Dispatch.call(this, "PixelSearch", new Variant(nLeft), new Variant(nTop), new Variant(nRight), new Variant(nBottom), new Variant(nCol), new Variant(nVar), new Variant(nStep));
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strProcess an input-parameter of type String
     * @return the result is of type int
     */
    public int processClose(String strProcess) {
        return Dispatch.call(this, "ProcessClose", strProcess).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strProcess an input-parameter of type String
     * @return the result is of type int
     */
    public int processExists(String strProcess) {
        return Dispatch.call(this, "ProcessExists", strProcess).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strProcess an input-parameter of type String
     * @param nPriority  an input-parameter of type int
     * @return the result is of type int
     */
    public int processSetPriority(String strProcess, int nPriority) {
        return Dispatch.call(this, "ProcessSetPriority", strProcess, new Variant(nPriority)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strProcess an input-parameter of type String
     * @return the result is of type int
     */
    public int processWait(String strProcess) {
        return Dispatch.call(this, "ProcessWait", strProcess).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strProcess an input-parameter of type String
     * @param nTimeout   an input-parameter of type int
     * @return the result is of type int
     */
    public int processWait(String strProcess, int nTimeout) {
        return Dispatch.call(this, "ProcessWait", strProcess, new Variant(nTimeout)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strProcess an input-parameter of type String
     * @return the result is of type int
     */
    public int processWaitClose(String strProcess) {
        return Dispatch.call(this, "ProcessWaitClose", strProcess).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strProcess an input-parameter of type String
     * @param nTimeout   an input-parameter of type int
     * @return the result is of type int
     */
    public int processWaitClose(String strProcess, int nTimeout) {
        return Dispatch.call(this, "ProcessWaitClose", strProcess, new Variant(nTimeout)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strKeyname an input-parameter of type String
     * @return the result is of type int
     */
    public int regDeleteKey(String strKeyname) {
        return Dispatch.call(this, "RegDeleteKey", strKeyname).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strKeyname   an input-parameter of type String
     * @param strValuename an input-parameter of type String
     * @return the result is of type int
     */
    public int regDeleteVal(String strKeyname, String strValuename) {
        return Dispatch.call(this, "RegDeleteVal", strKeyname, strValuename).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strKeyname an input-parameter of type String
     * @param nInstance  an input-parameter of type int
     * @return the result is of type String
     */
    public String regEnumKey(String strKeyname, int nInstance) {
        return Dispatch.call(this, "RegEnumKey", strKeyname, new Variant(nInstance)).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strKeyname an input-parameter of type String
     * @param nInstance  an input-parameter of type int
     * @return the result is of type String
     */
    public String regEnumVal(String strKeyname, int nInstance) {
        return Dispatch.call(this, "RegEnumVal", strKeyname, new Variant(nInstance)).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strKeyname   an input-parameter of type String
     * @param strValuename an input-parameter of type String
     * @return the result is of type String
     */
    public String regRead(String strKeyname, String strValuename) {
        return Dispatch.call(this, "RegRead", strKeyname, strValuename).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strKeyname   an input-parameter of type String
     * @param strValuename an input-parameter of type String
     * @param strType      an input-parameter of type String
     * @param strValue     an input-parameter of type String
     * @return the result is of type int
     */
    public int regWrite(String strKeyname, String strValuename, String strType, String strValue) {
        return Dispatch.call(this, "RegWrite", strKeyname, strValuename, strType, strValue).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strRun an input-parameter of type String
     * @param strDir an input-parameter of type String
     * @return the result is of type int
     */
    public int run(String strRun, String strDir) {
        return Dispatch.call(this, "Run", strRun, strDir).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strRun an input-parameter of type String
     * @return the result is of type int
     */
    public int run(String strRun) {
        return Dispatch.call(this, "Run", strRun).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strRun     an input-parameter of type String
     * @param strDir     an input-parameter of type String
     * @param nShowFlags an input-parameter of type int
     * @return the result is of type int
     */
    public int run(String strRun, String strDir, int nShowFlags) {
        return Dispatch.call(this, "Run", strRun, strDir, new Variant(nShowFlags)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strUser     an input-parameter of type String
     * @param strDomain   an input-parameter of type String
     * @param strPassword an input-parameter of type String
     * @param nOptions    an input-parameter of type int
     * @return the result is of type int
     */
    public int runAsSet(String strUser, String strDomain, String strPassword, int nOptions) {
        return Dispatch.call(this, "RunAsSet", strUser, strDomain, strPassword, new Variant(nOptions)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strRun an input-parameter of type String
     * @param strDir an input-parameter of type String
     * @return the result is of type int
     */
    public int runWait(String strRun, String strDir) {
        return Dispatch.call(this, "RunWait", strRun, strDir).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strRun an input-parameter of type String
     * @return the result is of type int
     */
    public int runWait(String strRun) {
        return Dispatch.call(this, "RunWait", strRun).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strRun     an input-parameter of type String
     * @param strDir     an input-parameter of type String
     * @param nShowFlags an input-parameter of type int
     * @return the result is of type int
     */
    public int runWait(String strRun, String strDir, int nShowFlags) {
        return Dispatch.call(this, "RunWait", strRun, strDir, new Variant(nShowFlags)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strSendText an input-parameter of type String
     */
    public void send(String strSendText) {
        Dispatch.call(this, "Send", strSendText);
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strSendText an input-parameter of type String
     * @param nMode       an input-parameter of type int
     */
    public void send(String strSendText, int nMode) {
        Dispatch.call(this, "Send", strSendText, new Variant(nMode));

    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param nFlags an input-parameter of type int
     * @return the result is of type int
     */
    public int shutdown(int nFlags) {
        return Dispatch.call(this, "Shutdown", new Variant(nFlags)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param nMilliseconds an input-parameter of type int
     */
    public void sleep(int nMilliseconds) {
        Dispatch.call(this, "Sleep", new Variant(nMilliseconds));
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type String
     */
    public String statusbarGetText(String strTitle, String strText) {
        return Dispatch.call(this, "StatusbarGetText", strTitle, strText).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type String
     */
    public String statusbarGetText(String strTitle) {
        return Dispatch.call(this, "StatusbarGetText", strTitle).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param nPart    an input-parameter of type int
     * @return the result is of type String
     */
    public String statusbarGetText(String strTitle, String strText, int nPart) {
        return Dispatch.call(this, "StatusbarGetText", strTitle, strText, new Variant(nPart)).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTip an input-parameter of type String
     * @param nX     an input-parameter of type int
     */
    public void toolTip(String strTip, int nX) {
        Dispatch.call(this, "ToolTip", strTip, new Variant(nX));
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTip an input-parameter of type String
     */
    public void toolTip(String strTip) {
        Dispatch.call(this, "ToolTip", strTip);
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTip an input-parameter of type String
     * @param nX     an input-parameter of type int
     * @param nY     an input-parameter of type int
     */
    public void toolTip(String strTip, int nX, int nY) {
        Dispatch.call(this, "ToolTip", strTip, new Variant(nX), new Variant(nY));

    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     */
    public void winActivate(String strTitle) {
        Dispatch.call(this, "WinActivate", strTitle);
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     */
    public void winActivate(String strTitle, String strText) {
        Dispatch.call(this, "WinActivate", strTitle, strText);

    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winActive(String strTitle) {
        return Dispatch.call(this, "WinActive", strTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
    public int winActive(String strTitle, String strText) {
        return Dispatch.call(this, "WinActive", strTitle, strText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winClose(String strTitle) {
        return Dispatch.call(this, "WinClose", strTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
    public int winClose(String strTitle, String strText) {
        return Dispatch.call(this, "WinClose", strTitle, strText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winExists(String strTitle) {
        return Dispatch.call(this, "WinExists", strTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
    public int winExists(String strTitle, String strText) {
        return Dispatch.call(this, "WinExists", strTitle, strText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int winGetCaretPosX() {
        return Dispatch.call(this, "WinGetCaretPosX").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @return the result is of type int
     */
    public int winGetCaretPosY() {
        return Dispatch.call(this, "WinGetCaretPosY").changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type String
     */
    public String winGetClassList(String strTitle) {
        return Dispatch.call(this, "WinGetClassList", strTitle).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type String
     */
    public String winGetClassList(String strTitle, String strText) {
        return Dispatch.call(this, "WinGetClassList", strTitle, strText).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetClientSizeHeight(String strTitle) {
        return Dispatch.call(this, "WinGetClientSizeHeight", strTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetClientSizeHeight(String strTitle, String strText) {
        return Dispatch.call(this, "WinGetClientSizeHeight", strTitle, strText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetClientSizeWidth(String strTitle) {
        return Dispatch.call(this, "WinGetClientSizeWidth", strTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetClientSizeWidth(String strTitle, String strText) {
        return Dispatch.call(this, "WinGetClientSizeWidth", strTitle, strText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type String
     */
    public String winGetHandle(String strTitle) {
        return Dispatch.call(this, "WinGetHandle", strTitle).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type String
     */
    public String winGetHandle(String strTitle, String strText) {
        return Dispatch.call(this, "WinGetHandle", strTitle, strText).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetPosX(String strTitle) {
        return Dispatch.call(this, "WinGetPosX", strTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetPosX(String strTitle, String strText) {
        return Dispatch.call(this, "WinGetPosX", strTitle, strText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetPosY(String strTitle) {
        return Dispatch.call(this, "WinGetPosY", strTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetPosY(String strTitle, String strText) {
        return Dispatch.call(this, "WinGetPosY", strTitle, strText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetPosHeight(String strTitle) {
        return Dispatch.call(this, "WinGetPosHeight", strTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetPosHeight(String strTitle, String strText) {
        return Dispatch.call(this, "WinGetPosHeight", strTitle, strText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetPosWidth(String strTitle) {
        return Dispatch.call(this, "WinGetPosWidth", strTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetPosWidth(String strTitle, String strText) {
        return Dispatch.call(this, "WinGetPosWidth", strTitle, strText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type String
     */
    public String winGetProcess(String strTitle) {
        return Dispatch.call(this, "WinGetProcess", strTitle).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type String
     */
    public String winGetProcess(String strTitle, String strText) {
        return Dispatch.call(this, "WinGetProcess", strTitle, strText).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetState(String strTitle) {
        return Dispatch.call(this, "WinGetState", strTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
    public int winGetState(String strTitle, String strText) {
        return Dispatch.call(this, "WinGetState", strTitle, strText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type String
     */
    public String winGetText(String strTitle) {
        return Dispatch.call(this, "WinGetText", strTitle).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type String
     */
    public String winGetText(String strTitle, String strText) {
        return Dispatch.call(this, "WinGetText", strTitle, strText).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type String
     */
    public String winGetTitle(String strTitle) {
        return Dispatch.call(this, "WinGetTitle", strTitle).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type String
     */
    public String winGetTitle(String strTitle, String strText) {
        return Dispatch.call(this, "WinGetTitle", strTitle, strText).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winKill(String strTitle) {
        return Dispatch.call(this, "WinKill", strTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
    public int winKill(String strTitle, String strText) {
        return Dispatch.call(this, "WinKill", strTitle, strText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param strItem1 an input-parameter of type String
     * @param strItem2 an input-parameter of type String
     * @param strItem3 an input-parameter of type String
     * @param strItem4 an input-parameter of type String
     * @param strItem5 an input-parameter of type String
     * @param strItem6 an input-parameter of type String
     * @param strItem7 an input-parameter of type String
     * @return the result is of type int
     */
    public int winMenuSelectItem(String strTitle, String strText, String strItem1, String strItem2, String strItem3, String strItem4, String strItem5, String strItem6, String strItem7) {
        return Dispatch.callN(this, "WinMenuSelectItem", new Object[]{strTitle, strText, strItem1, strItem2, strItem3, strItem4, strItem5, strItem6, strItem7}).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param strItem1 an input-parameter of type String
     * @param strItem2 an input-parameter of type String
     * @param strItem3 an input-parameter of type String
     * @param strItem4 an input-parameter of type String
     * @param strItem5 an input-parameter of type String
     * @param strItem6 an input-parameter of type String
     * @return the result is of type int
     */
    public int winMenuSelectItem(String strTitle, String strText, String strItem1, String strItem2, String strItem3, String strItem4, String strItem5, String strItem6) {
        return Dispatch.call(this, "WinMenuSelectItem", strTitle, strText, strItem1, strItem2, strItem3, strItem4, strItem5, strItem6).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param strItem1 an input-parameter of type String
     * @param strItem2 an input-parameter of type String
     * @param strItem3 an input-parameter of type String
     * @param strItem4 an input-parameter of type String
     * @param strItem5 an input-parameter of type String
     * @return the result is of type int
     */
    public int winMenuSelectItem(String strTitle, String strText, String strItem1, String strItem2, String strItem3, String strItem4, String strItem5) {
        return Dispatch.call(this, "WinMenuSelectItem", strTitle, strText, strItem1, strItem2, strItem3, strItem4, strItem5).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param strItem1 an input-parameter of type String
     * @param strItem2 an input-parameter of type String
     * @param strItem3 an input-parameter of type String
     * @param strItem4 an input-parameter of type String
     * @return the result is of type int
     */
    public int winMenuSelectItem(String strTitle, String strText, String strItem1, String strItem2, String strItem3, String strItem4) {
        return Dispatch.call(this, "WinMenuSelectItem", strTitle, strText, strItem1, strItem2, strItem3, strItem4).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param strItem1 an input-parameter of type String
     * @param strItem2 an input-parameter of type String
     * @param strItem3 an input-parameter of type String
     * @return the result is of type int
     */
    public int winMenuSelectItem(String strTitle, String strText, String strItem1, String strItem2, String strItem3) {
        return Dispatch.call(this, "WinMenuSelectItem", strTitle, strText, strItem1, strItem2, strItem3).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param strItem1 an input-parameter of type String
     * @param strItem2 an input-parameter of type String
     * @return the result is of type int
     */
    public int winMenuSelectItem(String strTitle, String strText, String strItem1, String strItem2) {
        return Dispatch.call(this, "WinMenuSelectItem", strTitle, strText, strItem1, strItem2).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param strItem1 an input-parameter of type String
     * @return the result is of type int
     */
    public int winMenuSelectItem(String strTitle, String strText, String strItem1) {
        return Dispatch.call(this, "WinMenuSelectItem", strTitle, strText, strItem1).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param strItem1 an input-parameter of type String
     * @param strItem2 an input-parameter of type String
     * @param strItem3 an input-parameter of type String
     * @param strItem4 an input-parameter of type String
     * @param strItem5 an input-parameter of type String
     * @param strItem6 an input-parameter of type String
     * @param strItem7 an input-parameter of type String
     * @param strItem8 an input-parameter of type String
     * @return the result is of type int
     */
    public int winMenuSelectItem(String strTitle, String strText, String strItem1, String strItem2, String strItem3, String strItem4, String strItem5, String strItem6, String strItem7, String strItem8) {
        return Dispatch.callN(this, "WinMenuSelectItem", new Object[]{strTitle, strText, strItem1, strItem2, strItem3, strItem4, strItem5, strItem6, strItem7, strItem8}).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     */
    public void winMinimizeAll() {
        Dispatch.call(this, "WinMinimizeAll");
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     */
    public void winMinimizeAllUndo() {
        Dispatch.call(this, "WinMinimizeAllUndo");
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param nX       an input-parameter of type int
     * @param nY       an input-parameter of type int
     * @param nWidth   an input-parameter of type int
     * @return the result is of type int
     */
    public int winMove(String strTitle, String strText, int nX, int nY, int nWidth) {
        return Dispatch.call(this, "WinMove", strTitle, strText, new Variant(nX), new Variant(nY), new Variant(nWidth)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param nX       an input-parameter of type int
     * @param nY       an input-parameter of type int
     * @return the result is of type int
     */
    public int winMove(String strTitle, String strText, int nX, int nY) {
        return Dispatch.call(this, "WinMove", strTitle, strText, new Variant(nX), new Variant(nY)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param nX       an input-parameter of type int
     * @param nY       an input-parameter of type int
     * @param nWidth   an input-parameter of type int
     * @param nHeight  an input-parameter of type int
     * @return the result is of type int
     */
    public int winMove(String strTitle, String strText, int nX, int nY, int nWidth, int nHeight) {
        return Dispatch.call(this, "WinMove", strTitle, strText, new Variant(nX), new Variant(nY), new Variant(nWidth), new Variant(nHeight)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param nFlag    an input-parameter of type int
     * @return the result is of type int
     */
    public int winSetOnTop(String strTitle, String strText, int nFlag) {
        return Dispatch.call(this, "WinSetOnTop", strTitle, strText, new Variant(nFlag)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param nFlags   an input-parameter of type int
     * @return the result is of type int
     */
    public int winSetState(String strTitle, String strText, int nFlags) {
        return Dispatch.call(this, "WinSetState", strTitle, strText, new Variant(nFlags)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle    an input-parameter of type String
     * @param strText     an input-parameter of type String
     * @param strNewTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winSetTitle(String strTitle, String strText, String strNewTitle) {
        return Dispatch.call(this, "WinSetTitle", strTitle, strText, strNewTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param nTrans   an input-parameter of type int
     * @return the result is of type int
     */
    public int winSetTrans(String strTitle, String strText, int nTrans) {
        return Dispatch.call(this, "WinSetTrans", strTitle, strText, new Variant(nTrans)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
    public int winWait(String strTitle, String strText) {
        return Dispatch.call(this, "WinWait", strTitle, strText).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
    public int winWait(String strTitle) {
        return Dispatch.call(this, "WinWait", strTitle).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param nTimeout an input-parameter of type int
     * @return the result is of type int
     */
    public int winWait(String strTitle, String strText, int nTimeout) {
        return Dispatch.call(this, "WinWait", strTitle, strText, new Variant(nTimeout)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param nTimeout an input-parameter of type int
     * @return the result is of type int
     */
    public int winWaitActive(String strTitle, String strText, int nTimeout) {
        return Dispatch.call(this, "WinWaitActive", strTitle, strText, new Variant(nTimeout)).changeType(Variant.VariantInt).getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
	public int winWaitActive(String strTitle, String strText) {
		return Dispatch.call(this, "WinWaitActive", strTitle, strText).changeType(Variant.VariantInt).getInt();
	}

	/**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
	public int winWaitActive(String strTitle) {
		return Dispatch.call(this, "WinWaitActive", strTitle).changeType(Variant.VariantInt).getInt();
	}

	/**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
	public int winWaitClose(String strTitle, String strText) {
		return Dispatch.call(this, "WinWaitClose", strTitle, strText).changeType(Variant.VariantInt).getInt();
	}

	/**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
	public int winWaitClose(String strTitle) {
		return Dispatch.call(this, "WinWaitClose", strTitle).changeType(Variant.VariantInt).getInt();
	}

	/**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param nTimeout an input-parameter of type int
     * @return the result is of type int
     */
	public int winWaitClose(String strTitle, String strText, int nTimeout) {
		return Dispatch.call(this, "WinWaitClose", strTitle, strText, new Variant(nTimeout)).changeType(Variant.VariantInt).getInt();
	}

	/**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @return the result is of type int
     */
	public int winWaitNotActive(String strTitle, String strText) {
		return Dispatch.call(this, "WinWaitNotActive", strTitle, strText).changeType(Variant.VariantInt).getInt();
	}

	/**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @return the result is of type int
     */
	public int winWaitNotActive(String strTitle) {
		return Dispatch.call(this, "WinWaitNotActive", strTitle).changeType(Variant.VariantInt).getInt();
	}

	/**
     * Wrapper for calling the ActiveX-Method and receiving the output-parameter(s).
     *
     * @param strTitle an input-parameter of type String
     * @param strText  an input-parameter of type String
     * @param nTimeout an input-parameter of type int
     * @return the result is of type int
     */
	public int winWaitNotActive(String strTitle, String strText, int nTimeout) {
		return Dispatch.call(this, "WinWaitNotActive", strTitle, strText, new Variant(nTimeout)).changeType(Variant.VariantInt).getInt();
	}

}
