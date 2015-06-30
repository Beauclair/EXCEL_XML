package com.blaiso.excelxml.serializer;

import java.util.List;

import jxl.Sheet;

public class Bol_segment {
	
	private static final long serialVersionUID = 1L;
	private static String UNKNOW_VALUE = "";
	
	private Bol_segment bolSegment;
	private BolID Bol_id;
	private LoadUnloadPlace2 Load_unload_place;
	private TradersSegment Traders_segment;
//	private CtnSegment ctn_segment;
	private GoodsSegment Goods_segment;
	private GoodsSegmentBoucle Goods_segment_Boucle;
	private ValueSegment Value_segment;
	private Location Location;
	
	public Bol_segment(){
		Bol_id = new BolID();
		Load_unload_place = new LoadUnloadPlace2();
		Traders_segment = new TradersSegment();
//		ctn_segment = new CtnSegment();
//		Goods_segment = new GoodsSegment();
		Value_segment = new ValueSegment();
		Location = new Location();
	}

	public Bol_segment getBolSegment() {
		return bolSegment;
	}

	public void setBolSegment(Bol_segment bolSegment) {
		this.bolSegment = bolSegment;
	}

	public BolID getBol_id() {
		return Bol_id;
	}

	public void setBol_id(BolID bol_id) {
		Bol_id = bol_id;
	}

	public LoadUnloadPlace2 getLoad_unload_place() {
		return Load_unload_place;
	}

	public void setLoad_unload_place(LoadUnloadPlace2 load_unload_place) {
		Load_unload_place = load_unload_place;
	}

	public TradersSegment getTraders_segment() {
		return Traders_segment;
	}

	public void setTraders_segment(TradersSegment traders_segment) {
		Traders_segment = traders_segment;
	}

//	public CtnSegment getCtn_segment() {
//		return ctn_segment;
//	}
//
//	public void setCtn_segment(CtnSegment ctn_segment) {
//		this.ctn_segment = ctn_segment;
//	}

	public GoodsSegment getGoods_segment() {
		return Goods_segment;
	}

	public void setGoods_segment(GoodsSegment goods_segment) {
		Goods_segment = goods_segment;
	}

	public ValueSegment getValue_segment() {
		return Value_segment;
	}

	public void setValue_segment(ValueSegment value_segment) {
		Value_segment = value_segment;
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location location) {
		Location = location;
	}
	
	public void addElement(Bol_segment p$elt) {
		if (bolSegment == null)
			bolSegment = new Bol_segment();
			bolSegment = p$elt;
	}
	
	public void addBolID(Sheet sheet, int i){
		try{Bol_id.setBol_reference(sheet.getCell("AB"+i).getContents());}catch(Exception e){Bol_id.setBol_reference(UNKNOW_VALUE);}
		try{Bol_id.setBol_nature(sheet.getCell("AC"+i).getContents());}catch(Exception e){Bol_id.setBol_nature(UNKNOW_VALUE);}
		try{Bol_id.setBol_type_code(sheet.getCell("AD"+i).getContents());}catch(Exception e){Bol_id.setBol_type_code(UNKNOW_VALUE);}
	}
	
	public void addLoadUnloadPlace2(Sheet sheet, int i){
		try{Load_unload_place.setPlace_of_loading_code(sheet.getCell("AE"+i).getContents());}catch(Exception e){Load_unload_place.setPlace_of_loading_code(UNKNOW_VALUE);}
		try{Load_unload_place.setPlace_of_unloading_code(sheet.getCell("AF"+i).getContents());}catch(Exception e){Load_unload_place.setPlace_of_unloading_code(UNKNOW_VALUE);}
	}
	
	public void addTradersSegment(Sheet sheet, int i){
		Traders_segment.initData(sheet.getCell("AG"+i).getContents(), sheet.getCell("AH"+i).getContents(), 
				sheet.getCell("AI"+i).getContents(),sheet.getCell("AJ"+i).getContents(), /*sheet.getCell("AK"+i).getContents(), sheet.getCell("AL"+i).getContents(), sheet.getCell("AM"+i).getContents(), sheet.getCell("AN"+i).getContents(),*/ 
				sheet.getCell("AK"+i).getContents(), sheet.getCell("AL"+i).getContents());
	}
	
//	public void addCtnSegment(Sheet sheet, int i){
//		try{ctn_segment.setCtn_reference(sheet.getCell("AQ"+i).getContents());}catch(Exception e){ctn_segment.setCtn_reference(UNKNOW_VALUE);}
//		try{ctn_segment.setType_of_container(sheet.getCell("AR"+i).getContents());}catch(Exception e){ctn_segment.setType_of_container(UNKNOW_VALUE);}
//		try{ctn_segment.setEmpty_Full(sheet.getCell("AS"+i).getContents());}catch(Exception e){ctn_segment.setEmpty_Full(UNKNOW_VALUE);}
//		try{ctn_segment.setMarks1(sheet.getCell("AT"+i).getContents());}catch(Exception e){ctn_segment.setMarks1(UNKNOW_VALUE);}
//		try{ctn_segment.setMarks2(sheet.getCell("AU"+i).getContents());}catch(Exception e){ctn_segment.setMarks2(UNKNOW_VALUE);}
//		try{ctn_segment.setMarks3(sheet.getCell("AV"+i).getContents());}catch(Exception e){ctn_segment.setMarks3(UNKNOW_VALUE);}
//		try{ctn_segment.setSealing_Party(sheet.getCell("AW"+i).getContents());}catch(Exception e){ctn_segment.setSealing_Party(UNKNOW_VALUE);}
//	}
	
	public void addGoodsSegment(Sheet sheet, int i){
		if(Goods_segment == null) Goods_segment = new GoodsSegment();
		Goods_segment.initData(sheet.getCell("AM"+i).getContents(), sheet.getCell("AN"+i).getContents(), sheet.getCell("AO"+i).getContents(), sheet.getCell("AP"+i).getContents(), 
				sheet.getCell("AQ"+i).getContents(), sheet.getCell("AR"+i).getContents(), sheet.getCell("AS"+i).getContents(), sheet.getCell("AT"+i).getContents(), sheet.getCell("AU"+i).getContents(), sheet.getCell("AV"+i).getContents(),
				sheet.getCell("AW"+i).getContents());
	}
	
	public void addValueSegment(Sheet sheet, int i){
		Value_segment.initData(sheet.getCell("AX"+i).getContents(), sheet.getCell("AY"+i).getContents(), sheet.getCell("AZ"+i).getContents(), sheet.getCell("BA"+i).getContents());
	}
	
	public void addLocation(Sheet sheet, int i){
		try{Location.setLocation_code(sheet.getCell("BB"+i).getContents());}catch(Exception e){Location.setLocation_code(UNKNOW_VALUE);}
		try{Location.setLocation_info(sheet.getCell("BC"+i).getContents());}catch(Exception e){Location.setLocation_info(UNKNOW_VALUE);}
	}
	
	public Bol_segment initData(Sheet sheet, int i){
		this.addBolID(sheet, i);
		this.addLoadUnloadPlace2(sheet, i);
		this.addTradersSegment(sheet, i);
//		this.addCtnSegment(sheet, i);
		this.addGoodsSegment(sheet, i);
		this.addValueSegment(sheet, i);
		this.addLocation(sheet, i);
		return this;
	}
	
	public Bol_segment initDataBoucle(Sheet sheet, int i, List<Integer> pas){
		this.addBolID(sheet, i);
		this.addLoadUnloadPlace2(sheet, i);
		this.addTradersSegment(sheet, i);
//		this.addCtnSegment(sheet, i);
		this.addGoodsSegmentBoucle(sheet, i, pas);
		this.addValueSegment(sheet, i);
		this.addLocation(sheet, i);
		return this;
	}
	
	public void addGoodsSegmentBoucle(Sheet sheet, int i, List<Integer> pas){
		if(Goods_segment_Boucle ==null) Goods_segment_Boucle = new GoodsSegmentBoucle();
		Goods_segment_Boucle.initDataBoucle(sheet,i,pas);
	}

}
