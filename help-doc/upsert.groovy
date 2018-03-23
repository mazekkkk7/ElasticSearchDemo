if (id && "" != id){
	ctx._source.id=id;
}
if (title && "" != title){
	ctx._source.title=title;
}
if (url && "" != url){
	ctx._source.url=url;
}