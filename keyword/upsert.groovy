if (keyword && "" != keyword){
	ctx._source.keyword=keyword;
}
if (searchType && "" != searchType){
	ctx._source.searchType=searchType;
}
if (frequency && 0 != frequency){
	ctx._source.frequency+=1;
}
