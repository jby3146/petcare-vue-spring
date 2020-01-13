import Vue from 'vue'
import VueRouter from 'vue-router'
import MainPage from '../components/pages/MainPage'
import MovieSearchPage from '../components/pages/MovieSearchPage'
import UserLoginForm from '../components/UserPage/UserLoginForm'
import UserInfoPage from '../components/UserPage/UserInfoPage'
import UserSignUpTOS from '../components/UserPage/UserSignUpTOS'
import TosPage from '../components/TOS/TosPage'
import ReservationPage from '../components/Reservation/ReservationPage'
import Applicate from '../components/pages/Applicate'
import Notice from '../components/Notice/Notice'
import VisitReservationPage from '../components/VisitReservation/VisitReservationPage'
import IndoorPlay from '../components/Notice/IndoorPlay'
import NoticeBoard from '../components/NoticeBoard/NoticeBoard'
import CareDiary from '../components/CareDiary/CareDiary'
import ReservationDetail from '../components/Reservation/ReservationDetail'
import QnA from '../components/pages/Qna'
import VisitReservationPet from '../components/VisitReservation/VisitReservationpet'
import VisitReservation from '../components/VisitReservation/VisitReservation'
import PetRegister from '../components/UserPage/PetRegister'
import VistiReservationDate from '../components/VisitReservation/VistiReservationDate'
Vue.use(VueRouter)

const router = new VueRouter({
  mode: 'history',
  routes: [
    { path: '/', component: MainPage, name: 'home' },
    { path: '/movies/search', component: MovieSearchPage, name: 'movie-search' },
    { path: '/login', component: UserLoginForm, name: 'login' },
    { path: '/userpage', component: UserInfoPage, name: 'userpage' },
    { path: '/signupTos', component: UserSignUpTOS, name: 'signupTos' },
    { path: '/tos', component: TosPage, name: 'tos' },
    { path: '/reservation', component: ReservationPage, name: 'reservation' },
    { path: '/applicate', component: Applicate, name:'applicate'},
    { path: '/notice', component: Notice, name:'notice'},
    { path: '/indoorplay', component: IndoorPlay, name:'indoorplay'},
    { path: '/noticeboard', component: NoticeBoard, name:'noticeboard'},
    { path: '/visitreservation', component: VisitReservationPage, name:'visitreservation'},
    { path: '/indoorplay', component: IndoorPlay, name:'indoorplay'},
    { path: '/carediary', component: CareDiary, name:'carediary'},
    { path: '/reservationdetail', component: ReservationDetail, name: 'reservationdetail' },
    { path: '/qna', component:QnA, name:'qna'},
    { path: '/visitreservationpet', component:VisitReservationPet,name:'visitreservationpet'},
    { path: '/visitreservationnext', component:VisitReservation,name:'visitreservationnext'},
    { path: '/petregister', component:PetRegister,name:'petregister'},
    { path: '/visitreservationdate', component:VistiReservationDate,name:'visitreservationdate'},
  ],
  scrollBehavior() {
    return { x: 0, y: 0 }
  },
})

export default router
