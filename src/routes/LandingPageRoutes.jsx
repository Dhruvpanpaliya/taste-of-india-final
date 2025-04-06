import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

import Home from "../Landing page/pages/Home";
import Submain from "../Landing page/components/subscription/submain.jsx";
import HeroSection from "../Landing page/components/hero/HeroSection.jsx";
import Review from "../Landing page/components/reviewpage/review";
import AuthForm from "../Landing page/components/Signup Code/signup.jsx";
import WalletSection from "../Landing page/components/wallet/Wallet_section.jsx";
import UpdateAdminDetails from "../Landing page/components/Admin/Update-details.jsx";
import OrderTracking from "../Landing page/components/User_order/OrderTracking.jsx";
import Dashboard from "../Landing page/components/super_admin/dashboard/Dashboard.jsx";
import CloudRegistration from "../Landing page/components/super_admin/kitchen_reg/CloudRegistration.jsx";
import AdminDetails from "../Landing page/components/super_admin/AdminDetails/AdminDetails.jsx";
import ManagerDetail from "../Landing page/components/super_admin/AdminDetails/ManagerDetail.jsx";
import Menu from "../Landing page/components/explore_menu/Menu.jsx";
// import SignUp from "../Landing page/components/signin/signup.jsx";
// import Cuisines from "../Landing page/components/popular_cusine/cuisines.js";
import PaymentPage from "../Landing page/pages/PaymentPage.jsx";
// import Menus from "../Landing page/components/Menus/Menus.jsx";


function LandingPageRoutes() { 
  return (
    <Router>
      <Routes>
        <Route path="/" element={<HeroSection />} />
        {/* <Route path="/menu" element={<Menus />} /> */}
        <Route path="/sub" element={<Submain />} />
        <Route path="/hero" element={<HeroSection />} />
        <Route path="/review" element={<Review />} />
        <Route path="/login" element={<AuthForm />} />
        <Route path="/wallet" element={<WalletSection />} /> 
        <Route path="/track_order" element={<OrderTracking />} />
        <Route path="/menu_explore" element={<Menu />} />
        <Route path="/payment" element={<PaymentPage/>} />
        {/* <Route path="/signin" element={<SignUp />} /> */}
        {/* <Route path="popular_cusine" element={<Cuisines/>}/> */}
        

        {/* super admin and admin routes */}
        <Route path="/editadmin" element={<UpdateAdminDetails />} />
        <Route path="/admin_dashboard" element={<Dashboard/>} />
        <Route path="/kitchen_reg" element={<CloudRegistration/>} />
        <Route path="/admin_details" element={<AdminDetails/>} />
        <Route path="/man_details" element={<ManagerDetail/>} />
      </Routes>
    </Router>
  );
}

export default  LandingPageRoutes;
