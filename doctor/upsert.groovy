if (uid && "" != uid){
	ctx._source.uid=uid;
}
if (name && "" != name){
	ctx._source.name=name;
}
if (null!=sex){
	ctx._source.sex=sex;
}
if (image && "" != image){
	ctx._source.image=image;
}
if (null!=area){
	ctx._source.area=area;
}
if (null!=hospital){
	ctx._source.hospital=hospital;
}
if (null!=dept){
	ctx._source.dept=dept;
}
if (null!=level){
	ctx._source.level=level;
}
if (null!=coordinates){
	ctx._source.coordinates=coordinates;
}
if (null!=assessTags){
	ctx._source.assessTags=assessTags;
}
if (null!=score){
	ctx._source.score=score;
}
if (null!=tags && "[]" != tags){
	ctx._source.tags=tags;
}
if (biography && "" != biography){
	ctx._source.biography=biography;
}
if (academicAchievements && "" != academicAchievements){
	ctx._source.academicAchievements=academicAchievements;
}
if (null!=isOpenVC){
	ctx._source.isOpenVC=isOpenVC;
}
if (null!=vcPrice){
	ctx._source.vcPrice=vcPrice;
}
if (null!=isOpenPMD){
	ctx._source.isOpenPMD=isOpenPMD;
}
if (null!=pmdPrice){
	ctx._source.pmdPrice=pmdPrice;
}
if (null!=isOpenRET){
	ctx._source.isOpenRET=isOpenRET;
}
if (null!=retPrice){
	ctx._source.retPrice=retPrice;
}
if (null!=isExpert){
	ctx._source.isExpert=isExpert;
}
if (null!=isVisit){
	ctx._source.isVisit=isVisit;
}
if (null!=fans){
	ctx._source.fans=fans;
}
if (null!=serviceCount && 0!=serviceCount){
	ctx._source.serviceCount=serviceCount;
}
if (null!=orderCount && 0!=orderCount){
	ctx._source.orderCount=orderCount;
}
if (null!=recommendPatient){
	ctx._source.recommendPatient=recommendPatient;
}
if (null!=recommendDoctor){
	ctx._source.recommendDoctor=recommendDoctor;
}
if (null!=assess){
	ctx._source.assess=assess;
}
if (null!=distance){
	ctx._source.distance=distance;
}
if (null!=isReal){
	ctx._source.isReal=isReal;
}
if (null!=isOpenFC){
	ctx._source.isOpenFC=isOpenFC;
}
if (null!=fcPrice){
	ctx._source.fcPrice=fcPrice;
}
if (null!=rank){
	ctx._source.rank=rank;
}
if (null!=rankCode){
	ctx._source.rankCode=rankCode;
}
if (null!=createTime){
	ctx._source.createTime=createTime;
}
if (null!=updateTime){
	ctx._source.updateTime=updateTime;
}

