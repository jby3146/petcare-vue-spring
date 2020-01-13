import axios from 'axios'

const apiUrl = '/api'

export default {
  findAllSitter() {
    return axios.get(`${apiUrl}/findAllSitter/`)
  },
  signUp(user) {
    return axios.post(`${apiUrl}/signUp/`, {
      name:user.name,
      address:user.address,
      email:user.email,
      pass:user.pass,
      birth:user.birth,
      nickname:user.nickname,
      name:user.name,
      user_type_id:user.user_type,
      gender:user.gender,
      x:user.x,
      y:user.y
    })
  },
  login(user) {
    return axios.post(`${apiUrl}/login/`, {
      email : user.email,
      pass : user.pass,
    })
  },
  SitterApply(params) {
    return axios.post(`${apiUrl}/sitterApply/`, {
      id : '0',
      phone : params.phone,
      subject : params.subject,
      residence_type_id : params.home_type,
      sitter_period_id : params.period,
      pet_size_id : params.size,
      sitter_type_id : params.sitter_type,
      user_email : params.email,
      daycare : params.daycare,
      staycare : params.staycare,
      imgurl : params.imgurl,
    })
  },
  VisitReservation(params){
    return axios.post(`${apiUrl}/reservationinsert/`,{
      useraddress : params.useraddress,
      end:params.end,
      id:0,
      petage:params.petage,
      petname:params.petname,
      petsize:params.petsize,
      pettype:params.pettype,
      reservation_type:params.reservationtype,
      start:params.start,
      user_email:params.user_email,
      detail_adress:params.detail_adress,
    })
  },
  SearchOnceUser(email){
     return axios.post(`${apiUrl}/userSelect/`,{
       email:email
    })
  },
  UpdateUser(params){
    return axios.post(`${apiUrl}/updateUser/`,{
      email:params.email,
      address:params.address,
      x:params.x,
      y:params.y
    })
  },
  searchoncereservation(user_email){
    return axios.get(`${apiUrl}/searchoncereservation?user_email=`+user_email)
  },
  searchoncereservationM(user_email){
    return axios.get(`${apiUrl}/searchoncereservationM?user_email=`+user_email)
  },
}