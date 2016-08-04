package org.cbioportal.pdb_annotation.util;

import java.util.*;
import org.cbioportal.pdb_annotation.scripts.PdbScriptsPipelineStarter;

/**
 *
 * Read application.properties by singleton design pattern
 *
 * @author Juexin Wang
 *
 */
public class ReadConfig {
	
	private static ReadConfig rcObj;
	
    public static String makeblastdb;
    public static String blastp;
    public static String workspace;
    public static String resourceDir;
    public static String tmpdir;
    public static String pdbSeqresDownloadFile;
    public static String pdbSeqresFastaFile;
    public static String ensemblDownloadFile;
    public static String ensemblFastaFile;
    public static String sqlInsertFile;
    public static String sqlDeleteFile;
    public static String blastParaEvalue;
    public static String blastParaWordSize;
    public static String blastParaThreads;
    public static String ensemblInputInterval;
    public static String sqlInsertOutputInterval;
    public static String mysql;
    public static String username;
    public static String password;
    public static String dbName;
    public static String dbNameScript;
    public static String pdbWholeSource;
    public static String ensemblWholeSource;
    public static String updateTxt;
    public static String updateFasta;
    public static String delPDB;
    public static String updateDAY;
    public static String updateHOUR;
    public static String updateMINUTE;
    public static String updateSECOND;
    public static String updateMILLISECOND;
    public static String updateDELAY;
    public static String sqlEnsemblSQL;
    public static String updateAdded;
    public static String updateModified;
    public static String updateObsolete;
    public static String pdbFastaService;
    public static String mysqlMaxAllowedPacket;
    
    private ReadConfig(){
    	try{
    	Properties prop = new Properties();   	
    	prop.load(PdbScriptsPipelineStarter.class.getClassLoader().getResourceAsStream("application.properties"));
    	
    	// Set all constants
    	ReadConfig.makeblastdb = prop.getProperty("makeblastdb");
    	ReadConfig.blastp = prop.getProperty("blastp");
    	ReadConfig.workspace = prop.getProperty("workspace");   	
    	ReadConfig.resourceDir = prop.getProperty("resource_dir");
    	ReadConfig.tmpdir = prop.getProperty("tmpdir");
    	ReadConfig.pdbSeqresDownloadFile = prop.getProperty("pdb_seqres_download_file");
    	ReadConfig.pdbSeqresFastaFile = prop.getProperty("pdb_seqres_fasta_file");
    	ReadConfig.ensemblDownloadFile = prop.getProperty("ensembl_download_file");
    	ReadConfig.ensemblFastaFile = prop.getProperty("ensembl_fasta_file");
    	ReadConfig.sqlInsertFile = prop.getProperty("sql_insert_file");
    	ReadConfig.sqlDeleteFile = prop.getProperty("sql_delete_file");
    	ReadConfig.blastParaEvalue = prop.getProperty("blast_para_evalue");
    	ReadConfig.blastParaWordSize = prop.getProperty("blast_para_word_size");
    	ReadConfig.blastParaThreads = prop.getProperty("blast_para_threads");
    	ReadConfig.ensemblInputInterval = prop.getProperty("ensembl_input_interval");
    	ReadConfig.sqlInsertOutputInterval = prop.getProperty("sql_insert_output_interval");
    	ReadConfig.mysql = prop.getProperty("mysql");
    	ReadConfig.username = prop.getProperty("username");
    	ReadConfig.password = prop.getProperty("password");
    	ReadConfig.dbName = prop.getProperty("db_name");
    	ReadConfig.dbNameScript = prop.getProperty("db_name_script");
    	ReadConfig.pdbWholeSource = prop.getProperty("pdb.wholeSource");
    	ReadConfig.ensemblWholeSource = prop.getProperty("ensembl.wholeSource");
    	ReadConfig.updateTxt = prop.getProperty("update.updateTxt");
    	ReadConfig.updateFasta = prop.getProperty("update.updateFasta");
    	ReadConfig.delPDB = prop.getProperty("update.delPDB");
    	ReadConfig.updateDAY = prop.getProperty("update.DAY_OF_WEEK");
    	ReadConfig.updateHOUR = prop.getProperty("update.HOUR_OF_DAY");
    	ReadConfig.updateMINUTE = prop.getProperty("update.MINUTE");
    	ReadConfig.updateSECOND = prop.getProperty("update.SECOND");
    	ReadConfig.updateMILLISECOND = prop.getProperty("update.MILLISECOND");
    	ReadConfig.updateDELAY = prop.getProperty("update.DELAY");
    	ReadConfig.sqlEnsemblSQL = prop.getProperty("sql_ensemblSQL");
    	ReadConfig.updateAdded = prop.getProperty("update.added");
    	ReadConfig.updateModified = prop.getProperty("update.modified");
    	ReadConfig.updateObsolete = prop.getProperty("update.obsolete");
    	ReadConfig.pdbFastaService = prop.getProperty("pdb.fastaService");
    	ReadConfig.mysqlMaxAllowedPacket = prop.getProperty("mysql_max_allowed_packet");
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    }
    
    public static ReadConfig getInstance(){
        if(rcObj == null){
            rcObj = new ReadConfig();
        }
        return rcObj;
    }

	public static ReadConfig getRcObj() {
		return rcObj;
	}

	public static String getMakeblastdb() {
		return makeblastdb;
	}

	public static String getBlastp() {
		return blastp;
	}

	public static String getWorkspace() {
		return workspace;
	}

	public static String getResourceDir() {
		return resourceDir;
	}

	public static String getTmpdir() {
		return tmpdir;
	}

	public static String getPdbSeqresDownloadFile() {
		return pdbSeqresDownloadFile;
	}

	public static String getPdbSeqresFastaFile() {
		return pdbSeqresFastaFile;
	}

	public static String getEnsemblDownloadFile() {
		return ensemblDownloadFile;
	}

	public static String getEnsemblFastaFile() {
		return ensemblFastaFile;
	}

	public static String getSqlInsertFile() {
		return sqlInsertFile;
	}

	public static String getSqlDeleteFile() {
		return sqlDeleteFile;
	}

	public static String getBlastParaEvalue() {
		return blastParaEvalue;
	}
	
	public static String getBlastParaWordSize() {
		return blastParaWordSize;
	}

	public static String getBlastParaThreads() {
		return blastParaThreads;
	}

	public static String getEnsemblInputInterval() {
		return ensemblInputInterval;
	}

	public static String getSqlInsertOutputInterval() {
		return sqlInsertOutputInterval;
	}

	public static String getMysql() {
		return mysql;
	}

	public static String getUsername() {
		return username;
	}

	public static String getPassword() {
		return password;
	}

	public static String getDbName() {
		return dbName;
	}

	public static String getDbNameScript() {
		return dbNameScript;
	}

	public static String getPdbWholeSource() {
		return pdbWholeSource;
	}

	public static String getEnsemblWholeSource() {
		return ensemblWholeSource;
	}

	public static String getUpdateTxt() {
		return updateTxt;
	}

	public static String getUpdateFasta() {
		return updateFasta;
	}

	public static String getDelPDB() {
		return delPDB;
	}

	public static String getUpdateDAY() {
		return updateDAY;
	}

	public static String getUpdateHOUR() {
		return updateHOUR;
	}

	public static String getUpdateMINUTE() {
		return updateMINUTE;
	}

	public static String getUpdateSECOND() {
		return updateSECOND;
	}

	public static String getUpdateMILLISECOND() {
		return updateMILLISECOND;
	}

	public static String getUpdateDELAY() {
		return updateDELAY;
	}

	public static String getSqlEnsemblSQL() {
		return sqlEnsemblSQL;
	}

	public static String getUpdateAdded() {
		return updateAdded;
	}

	public static String getUpdateModified() {
		return updateModified;
	}

	public static String getUpdateObsolete() {
		return updateObsolete;
	}

	public static String getPdbFastaService() {
		return pdbFastaService;
	}

	public static String getMysqlMaxAllowedPacket() {
		return mysqlMaxAllowedPacket;
	}

	public static void setRcObj(ReadConfig rcObj) {
		ReadConfig.rcObj = rcObj;
	}

	public static void setMakeblastdb(String makeblastdb) {
		ReadConfig.makeblastdb = makeblastdb;
	}

	public static void setBlastp(String blastp) {
		ReadConfig.blastp = blastp;
	}

	public static void setWorkspace(String workspace) {
		ReadConfig.workspace = workspace;
	}

	public static void setResourceDir(String resourceDir) {
		ReadConfig.resourceDir = resourceDir;
	}

	public static void setTmpdir(String tmpdir) {
		ReadConfig.tmpdir = tmpdir;
	}

	public static void setPdbSeqresDownloadFile(String pdbSeqresDownloadFile) {
		ReadConfig.pdbSeqresDownloadFile = pdbSeqresDownloadFile;
	}

	public static void setPdbSeqresFastaFile(String pdbSeqresFastaFile) {
		ReadConfig.pdbSeqresFastaFile = pdbSeqresFastaFile;
	}

	public static void setEnsemblDownloadFile(String ensemblDownloadFile) {
		ReadConfig.ensemblDownloadFile = ensemblDownloadFile;
	}

	public static void setEnsemblFastaFile(String ensemblFastaFile) {
		ReadConfig.ensemblFastaFile = ensemblFastaFile;
	}

	public static void setSqlInsertFile(String sqlInsertFile) {
		ReadConfig.sqlInsertFile = sqlInsertFile;
	}

	public static void setSqlDeleteFile(String sqlDeleteFile) {
		ReadConfig.sqlDeleteFile = sqlDeleteFile;
	}

	public static void setBlastParaEvalue(String blastParaEvalue) {
		ReadConfig.blastParaEvalue = blastParaEvalue;
	}
	
	public static void setBlastParaWordSize(String blastParaWordSize) {
		ReadConfig.blastParaWordSize = blastParaWordSize;
	}

	public static void setBlastParaThreads(String blastParaThreads) {
		ReadConfig.blastParaThreads = blastParaThreads;
	}

	public static void setEnsemblInputInterval(String ensemblInputInterval) {
		ReadConfig.ensemblInputInterval = ensemblInputInterval;
	}

	public static void setSqlInsertOutputInterval(String sqlInsertOutputInterval) {
		ReadConfig.sqlInsertOutputInterval = sqlInsertOutputInterval;
	}

	public static void setMysql(String mysql) {
		ReadConfig.mysql = mysql;
	}

	public static void setUsername(String username) {
		ReadConfig.username = username;
	}

	public static void setPassword(String password) {
		ReadConfig.password = password;
	}

	public static void setDbName(String dbName) {
		ReadConfig.dbName = dbName;
	}

	public static void setDbNameScript(String dbNameScript) {
		ReadConfig.dbNameScript = dbNameScript;
	}

	public static void setPdbWholeSource(String pdbWholeSource) {
		ReadConfig.pdbWholeSource = pdbWholeSource;
	}

	public static void setEnsemblWholeSource(String ensemblWholeSource) {
		ReadConfig.ensemblWholeSource = ensemblWholeSource;
	}

	public static void setUpdateTxt(String updateTxt) {
		ReadConfig.updateTxt = updateTxt;
	}

	public static void setUpdateFasta(String updateFasta) {
		ReadConfig.updateFasta = updateFasta;
	}

	public static void setDelPDB(String delPDB) {
		ReadConfig.delPDB = delPDB;
	}

	public static void setUpdateDAY(String updateDAY) {
		ReadConfig.updateDAY = updateDAY;
	}

	public static void setUpdateHOUR(String updateHOUR) {
		ReadConfig.updateHOUR = updateHOUR;
	}

	public static void setUpdateMINUTE(String updateMINUTE) {
		ReadConfig.updateMINUTE = updateMINUTE;
	}

	public static void setUpdateSECOND(String updateSECOND) {
		ReadConfig.updateSECOND = updateSECOND;
	}

	public static void setUpdateMILLISECOND(String updateMILLISECOND) {
		ReadConfig.updateMILLISECOND = updateMILLISECOND;
	}

	public static void setUpdateDELAY(String updateDELAY) {
		ReadConfig.updateDELAY = updateDELAY;
	}

	public static void setSqlEnsemblSQL(String sqlEnsemblSQL) {
		ReadConfig.sqlEnsemblSQL = sqlEnsemblSQL;
	}

	public static void setUpdateAdded(String updateAdded) {
		ReadConfig.updateAdded = updateAdded;
	}

	public static void setUpdateModified(String updateModified) {
		ReadConfig.updateModified = updateModified;
	}

	public static void setUpdateObsolete(String updateObsolete) {
		ReadConfig.updateObsolete = updateObsolete;
	}

	public static void setPdbFastaService(String pdbFastaService) {
		ReadConfig.pdbFastaService = pdbFastaService;
	}

	public static void setMysqlMaxAllowedPacket(String mysqlMaxAllowedPacket) {
		ReadConfig.mysqlMaxAllowedPacket = mysqlMaxAllowedPacket;
	}

}